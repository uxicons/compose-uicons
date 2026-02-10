package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Triangle: ImageVector? = null

val Icons.Tr.Triangle: ImageVector
    get() = _Triangle ?: UXIcon(name = "Triangle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.35f, 22.03f)
                horizontalLineTo(2.65f)
                curveToRelative(-0.77f, 0f, -1.46f, -0.4f, -1.85f, -1.06f)
                curveToRelative(-0.39f, -0.67f, -0.4f, -1.47f, -0.03f, -2.15f)
                lineTo(9.95f, 2.26f)
                curveToRelative(0.43f, -0.77f, 1.19f, -1.24f, 2.05f, -1.24f)
                reflectiveCurveToRelative(1.63f, 0.46f, 2.05f, 1.24f)
                lineToRelative(9.17f, 16.55f)
                curveToRelative(0.38f, 0.68f, 0.36f, 1.48f, -0.03f, 2.15f)
                curveToRelative(-0.39f, 0.66f, -1.08f, 1.06f, -1.85f, 1.06f)
                close()
                moveTo(12f, 2.03f)
                curveToRelative(-0.49f, 0f, -0.93f, 0.27f, -1.18f, 0.72f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(1.65f, 19.3f, 1.65f, 19.3f)
                curveToRelative(-0.2f, 0.36f, -0.2f, 0.8f, 0.01f, 1.16f)
                curveToRelative(0.21f, 0.35f, 0.58f, 0.57f, 0.99f, 0.57f)
                horizontalLineToRelative(18.7f)
                curveToRelative(0.41f, 0f, 0.78f, -0.21f, 0.99f, -0.57f)
                curveToRelative(0.21f, -0.36f, 0.22f, -0.79f, 0.01f, -1.16f)
                lineTo(13.18f, 2.75f)
                curveToRelative(-0.25f, -0.45f, -0.69f, -0.72f, -1.18f, -0.72f)
                close()
            }
        }.also { _Triangle = it}
