package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareSquare: ImageVector? = null

val Icons.Rr.ShareSquare: ImageVector
    get() = _ShareSquare ?: UXIcon(name = "ShareSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 19f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveTo(2.24f, 24f, 0f, 21.76f, 0f, 19f)
                verticalLineToRelative(-7f)
                curveTo(0f, 9.24f, 2.24f, 7f, 5f, 7f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(23.13f, 5.89f)
                lineTo(17.72f, 0.3f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.02f)
                reflectiveCurveToRelative(-0.41f, 1.02f, -0.02f, 1.41f)
                lineToRelative(5.14f, 5.3f)
                lineTo(13f, 6.99f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8.42f)
                lineToRelative(-5.14f, 5.3f)
                curveToRelative(-0.38f, 0.4f, -0.38f, 1.03f, 0.02f, 1.41f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.28f, 0.7f, 0.28f)
                reflectiveCurveToRelative(0.52f, -0.1f, 0.72f, -0.3f)
                lineToRelative(5.4f, -5.57f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.01f, -4.23f)
                close()
            }
        }.also { _ShareSquare = it}
