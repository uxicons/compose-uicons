package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromLeft: ImageVector? = null

val Icons.Tr.ArrowFromLeft: ImageVector
    get() = _ArrowFromLeft ?: UXIcon(name = "ArrowFromLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.18f, 5.15f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(5.08f, 5.09f)
                curveToRelative(0.16f, 0.16f, 0.28f, 0.35f, 0.35f, 0.56f)
                horizontalLineTo(1f)
                verticalLineTo(5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6f)
                horizontalLineTo(22.91f)
                curveToRelative(-0.07f, 0.21f, -0.19f, 0.4f, -0.35f, 0.56f)
                lineToRelative(-5.08f, 5.09f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(5.08f, -5.09f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.3f, -0.73f, -1.77f)
                lineToRelative(-5.08f, -5.09f)
                close()
            }
        }.also { _ArrowFromLeft = it}
