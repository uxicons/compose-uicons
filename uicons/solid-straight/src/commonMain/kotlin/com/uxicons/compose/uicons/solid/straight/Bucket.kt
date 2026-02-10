package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bucket: ImageVector? = null

val Icons.Ss.Bucket: ImageVector
    get() = _Bucket ?: UXIcon(name = "Bucket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.38f, 8f)
                curveToRelative(-0.5f, -3.16f, -2.57f, -5.8f, -5.38f, -7.11f)
                verticalLineToRelative(-0.89f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(0.89f)
                curveToRelative(-2.81f, 1.31f, -4.88f, 3.95f, -5.38f, 7.11f)
                horizontalLineToRelative(-1.62f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.69f)
                lineToRelative(0.43f, 2f)
                horizontalLineToRelative(14.71f)
                lineToRelative(-0.43f, 2f)
                lineTo(3.55f, 14f)
                lineToRelative(2.14f, 10f)
                horizontalLineToRelative(12.62f)
                lineToRelative(3f, -14f)
                horizontalLineToRelative(1.69f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.62f)
                close()
                moveTo(4.65f, 8f)
                curveToRelative(0.41f, -2.03f, 1.65f, -3.76f, 3.35f, -4.83f)
                verticalLineToRelative(0.83f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-0.83f)
                curveToRelative(1.7f, 1.07f, 2.94f, 2.8f, 3.35f, 4.83f)
                lineTo(4.65f, 8f)
                close()
            }
        }.also { _Bucket = it}
