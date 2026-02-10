package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comment: ImageVector? = null

val Icons.Sc.Comment: ImageVector
    get() = _Comment ?: UXIcon(name = "Comment") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.05f, 6.31f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.69f, -2.04f, -2.32f, -3.67f, -4.36f, -4.36f)
                curveToRelative(-3.77f, -1.27f, -7.6f, -1.27f, -11.37f, 0f)
                curveToRelative(-2.04f, 0.69f, -3.67f, 2.32f, -4.36f, 4.36f)
                curveToRelative(-1.27f, 3.77f, -1.27f, 7.6f, 0f, 11.37f)
                curveToRelative(0.69f, 2.04f, 2.32f, 3.67f, 4.36f, 4.36f)
                curveToRelative(1.88f, 0.63f, 3.8f, 0.95f, 5.69f, 0.95f)
                curveToRelative(3.02f, 0f, 6.08f, -0.4f, 9.1f, -1.18f)
                curveToRelative(0.35f, -0.09f, 0.62f, -0.36f, 0.72f, -0.72f)
                curveToRelative(0.79f, -3.02f, 1.18f, -6.08f, 1.18f, -9.1f)
                curveToRelative(0f, -1.89f, -0.32f, -3.8f, -0.95f, -5.69f)
                close()
                moveTo(7.94f, 6.98f)
                horizontalLineToRelative(2.9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(16.06f, 17.02f)
                lineTo(7.94f, 17.02f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8.13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(17.06f, 13f)
                lineTo(6.94f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10.13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Comment = it}
