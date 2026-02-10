package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToTop: ImageVector? = null

val Icons.Tr.ArrowToTop: ImageVector
    get() = _ArrowToTop ?: UXIcon(name = "ArrowToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.15f, 6.65f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                lineTo(10.94f, 2.27f)
                curveToRelative(0.16f, -0.16f, 0.36f, -0.27f, 0.56f, -0.34f)
                verticalLineTo(23.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(1.93f)
                curveToRelative(0.2f, 0.07f, 0.4f, 0.18f, 0.56f, 0.34f)
                lineToRelative(5.09f, 5.09f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineTo(13.77f, 1.56f)
                curveToRelative(-0.26f, -0.25f, -0.55f, -0.44f, -0.87f, -0.56f)
                horizontalLineToRelative(5.6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.6f)
                curveToRelative(-0.32f, 0.12f, -0.61f, 0.31f, -0.87f, 0.56f)
                lineTo(5.15f, 6.65f)
                close()
            }
        }.also { _ArrowToTop = it}
