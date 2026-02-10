package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeRight: ImageVector? = null

val Icons.Tr.MarsStrokeRight: ImageVector
    get() = _MarsStrokeRight ?: UXIcon(name = "MarsStrokeRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.28f, 10.24f)
                lineToRelative(-2.91f, -3.09f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.21f, -0.71f, -0.02f)
                curveToRelative(-0.2f, 0.19f, -0.21f, 0.51f, -0.02f, 0.71f)
                lineToRelative(2.92f, 3.1f)
                curveToRelative(0.16f, 0.16f, 0.28f, 0.35f, 0.35f, 0.56f)
                horizontalLineToRelative(-5.92f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.26f, -3.63f, -3.29f, -6.5f, -6.98f, -6.5f)
                curveTo(3.14f, 5f, 0f, 8.14f, 0f, 12f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                curveToRelative(3.69f, 0f, 6.72f, -2.87f, 6.98f, -6.5f)
                horizontalLineToRelative(2.02f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.91f)
                curveToRelative(-0.07f, 0.21f, -0.2f, 0.4f, -0.36f, 0.57f)
                lineToRelative(-2.91f, 3.09f)
                curveToRelative(-0.19f, 0.2f, -0.18f, 0.52f, 0.02f, 0.71f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.14f, 0.34f, 0.14f)
                curveToRelative(0.13f, 0f, 0.27f, -0.05f, 0.36f, -0.16f)
                lineToRelative(2.9f, -3.08f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.3f, -0.72f, -1.76f)
                close()
                moveTo(7f, 18f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(3.69f, 6f, 7f, 6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _MarsStrokeRight = it}
