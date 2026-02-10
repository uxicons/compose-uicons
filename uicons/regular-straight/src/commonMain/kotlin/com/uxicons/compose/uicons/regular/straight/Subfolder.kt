package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subfolder: ImageVector? = null

val Icons.Rs.Subfolder: ImageVector
    get() = _Subfolder ?: UXIcon(name = "Subfolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6f)
                verticalLineToRelative(3.03f)
                curveToRelative(-0.58f, -0.44f, -1.26f, -0.77f, -2f, -0.92f)
                verticalLineToRelative(-2.1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(11.76f, 5.0f)
                lineTo(7.76f, 3f)
                lineTo(3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 21f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                lineTo(0f, 23f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(24f, 13f)
                verticalLineToRelative(10f)
                lineTo(7f, 23f)
                lineTo(7f, 11f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(3.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 13f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.24f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-2.76f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(13f)
                lineTo(22f, 13f)
                close()
            }
        }.also { _Subfolder = it}
