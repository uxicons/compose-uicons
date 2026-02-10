package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoDuration: ImageVector? = null

val Icons.Rs.VideoDuration: ImageVector
    get() = _VideoDuration ?: UXIcon(name = "VideoDuration") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 10.11f)
                lineToRelative(-7f, 3.89f)
                verticalLineToRelative(-7.78f)
                lineToRelative(7f, 3.89f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.42f)
                lineToRelative(2.08f, 2.02f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(-1.47f, -1.43f)
                verticalLineToRelative(-2.58f)
                close()
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(10.26f)
                curveToRelative(-0.17f, -0.64f, -0.26f, -1.31f, -0.26f, -2f)
                lineTo(2f, 18f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8.08f)
                curveToRelative(0.75f, 0.44f, 1.43f, 0.99f, 2f, 1.64f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _VideoDuration = it}
