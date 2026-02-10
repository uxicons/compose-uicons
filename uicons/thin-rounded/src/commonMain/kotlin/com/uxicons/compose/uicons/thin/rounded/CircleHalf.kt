package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHalf: ImageVector? = null

val Icons.Tr.CircleHalf: ImageVector
    get() = _CircleHalf ?: UXIcon(name = "CircleHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.04f, 24.02f)
                curveToRelative(-0.24f, 0f, -0.48f, -0.03f, -0.72f, -0.09f)
                curveTo(4.01f, 22.55f, 0f, 17.42f, 0f, 12f)
                reflectiveCurveTo(4.01f, 1.47f, 9.32f, 0.09f)
                curveToRelative(0.87f, -0.22f, 1.78f, -0.03f, 2.5f, 0.52f)
                curveToRelative(0.75f, 0.58f, 1.18f, 1.46f, 1.18f, 2.4f)
                lineTo(13f, 21f)
                curveToRelative(0f, 0.94f, -0.43f, 1.82f, -1.18f, 2.4f)
                curveToRelative(-0.52f, 0.4f, -1.15f, 0.62f, -1.78f, 0.62f)
                close()
                moveTo(10.04f, 1.01f)
                curveToRelative(-0.16f, 0f, -0.31f, 0.02f, -0.47f, 0.06f)
                curveTo(4.69f, 2.32f, 1f, 7.03f, 1f, 12f)
                reflectiveCurveToRelative(3.69f, 9.69f, 8.57f, 10.96f)
                curveToRelative(0.57f, 0.15f, 1.16f, 0.02f, 1.63f, -0.35f)
                curveToRelative(0.5f, -0.39f, 0.79f, -0.98f, 0.79f, -1.61f)
                lineTo(11.99f, 3.02f)
                curveToRelative(0f, -0.63f, -0.29f, -1.22f, -0.79f, -1.61f)
                curveToRelative(-0.34f, -0.27f, -0.75f, -0.41f, -1.17f, -0.41f)
                close()
            }
        }.also { _CircleHalf = it}
