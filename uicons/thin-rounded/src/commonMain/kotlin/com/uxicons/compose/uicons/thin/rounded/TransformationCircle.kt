package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationCircle: ImageVector? = null

val Icons.Tr.TransformationCircle: ImageVector
    get() = _TransformationCircle ?: UXIcon(name = "TransformationCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.5f)
                curveToRelative(0f, 3.02f, -1.63f, 5.85f, -4.25f, 7.36f)
                curveToRelative(-0.08f, 0.05f, -0.17f, 0.07f, -0.25f, 0.07f)
                curveToRelative(-0.17f, 0f, -0.34f, -0.09f, -0.43f, -0.25f)
                curveToRelative(-0.14f, -0.24f, -0.06f, -0.55f, 0.18f, -0.68f)
                curveToRelative(2.31f, -1.34f, 3.75f, -3.83f, 3.75f, -6.5f)
                curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
                curveToRelative(-2.67f, 0f, -5.16f, 1.44f, -6.5f, 3.75f)
                curveToRelative(-0.14f, 0.24f, -0.44f, 0.32f, -0.68f, 0.18f)
                curveToRelative(-0.24f, -0.14f, -0.32f, -0.44f, -0.18f, -0.68f)
                curveTo(9.65f, 1.63f, 12.47f, 0f, 15.5f, 0f)
                curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
                close()
                moveTo(19f, 8.5f)
                verticalLineToRelative(-2.79f)
                lineToRelative(-4.16f, 4.16f)
                curveToRelative(1.34f, 1.5f, 2.16f, 3.47f, 2.16f, 5.64f)
                curveToRelative(0f, 4.69f, -3.81f, 8.5f, -8.5f, 8.5f)
                reflectiveCurveTo(0f, 20.19f, 0f, 15.5f)
                reflectiveCurveTo(3.81f, 7f, 8.5f, 7f)
                curveToRelative(2.16f, 0f, 4.13f, 0.82f, 5.64f, 2.16f)
                lineToRelative(4.16f, -4.16f)
                lineToRelative(-2.8f, 0.01f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineToRelative(2.99f, -0.01f)
                curveToRelative(0.83f, 0f, 1.51f, 0.68f, 1.51f, 1.51f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(16f, 15.5f)
                curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
                reflectiveCurveTo(1f, 11.36f, 1f, 15.5f)
                reflectiveCurveToRelative(3.36f, 7.5f, 7.5f, 7.5f)
                reflectiveCurveToRelative(7.5f, -3.36f, 7.5f, -7.5f)
                close()
            }
        }.also { _TransformationCircle = it}
