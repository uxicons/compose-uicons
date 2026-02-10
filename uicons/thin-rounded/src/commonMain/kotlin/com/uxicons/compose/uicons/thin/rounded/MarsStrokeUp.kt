package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeUp: ImageVector? = null

val Icons.Tr.MarsStrokeUp: ImageVector
    get() = _MarsStrokeUp ?: UXIcon(name = "MarsStrokeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 10.02f)
                verticalLineToRelative(-2.02f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                lineTo(12.5f, 1.09f)
                curveToRelative(0.21f, 0.07f, 0.4f, 0.19f, 0.57f, 0.36f)
                lineToRelative(3.09f, 2.91f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.14f, 0.34f, 0.14f)
                curveToRelative(0.13f, 0f, 0.27f, -0.05f, 0.36f, -0.16f)
                curveToRelative(0.19f, -0.2f, 0.18f, -0.52f, -0.02f, -0.71f)
                lineTo(13.77f, 0.73f)
                curveToRelative(-0.97f, -0.97f, -2.56f, -0.97f, -3.52f, -0.01f)
                lineToRelative(-3.09f, 2.91f)
                curveToRelative(-0.2f, 0.19f, -0.21f, 0.51f, -0.02f, 0.71f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.21f, 0.71f, 0.02f)
                lineToRelative(3.1f, -2.92f)
                curveToRelative(0.16f, -0.16f, 0.36f, -0.28f, 0.56f, -0.35f)
                lineTo(11.5f, 7f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.02f)
                curveToRelative(-3.63f, 0.26f, -6.5f, 3.29f, -6.5f, 6.98f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -3.69f, -2.87f, -6.72f, -6.5f, -6.98f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _MarsStrokeUp = it}
