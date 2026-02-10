package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bucket: ImageVector? = null

val Icons.Ts.Bucket: ImageVector
    get() = _Bucket ?: UXIcon(name = "Bucket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 8f)
                horizontalLineToRelative(-1.22f)
                curveToRelative(-0.57f, -2.78f, -2.32f, -5.22f, -4.78f, -6.65f)
                lineTo(17f, 0f)
                lineTo(7f, 0f)
                verticalLineToRelative(1.35f)
                curveToRelative(-2.46f, 1.43f, -4.21f, 3.87f, -4.78f, 6.65f)
                horizontalLineToRelative(-1.22f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.09f)
                lineToRelative(3f, 15f)
                horizontalLineToRelative(13.82f)
                lineToRelative(3f, -15f)
                horizontalLineToRelative(1.09f)
                verticalLineToRelative(-1f)
                close()
                moveTo(8f, 1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 1f)
                close()
                moveTo(7f, 2.53f)
                verticalLineToRelative(1.47f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1.47f)
                curveToRelative(1.9f, 1.28f, 3.25f, 3.25f, 3.76f, 5.47f)
                lineTo(3.24f, 8f)
                curveToRelative(0.51f, -2.23f, 1.86f, -4.2f, 3.76f, -5.47f)
                close()
                moveTo(18.09f, 23f)
                lineTo(5.91f, 23f)
                lineToRelative(-2f, -10f)
                horizontalLineToRelative(14.14f)
                lineToRelative(0.2f, -1f)
                lineTo(3.71f, 12f)
                lineToRelative(-0.6f, -3f)
                horizontalLineToRelative(17.78f)
                lineToRelative(-2.8f, 14f)
                close()
            }
        }.also { _Bucket = it}
