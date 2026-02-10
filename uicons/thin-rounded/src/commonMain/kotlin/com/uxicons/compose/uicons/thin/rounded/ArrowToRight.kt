package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToRight: ImageVector? = null

val Icons.Tr.ArrowToRight: ImageVector
    get() = _ArrowToRight ?: UXIcon(name = "ArrowToRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5.6f)
                curveToRelative(-0.12f, -0.32f, -0.31f, -0.62f, -0.56f, -0.87f)
                lineToRelative(-5.09f, -5.09f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(5.09f, 5.09f)
                curveToRelative(0.16f, 0.16f, 0.28f, 0.35f, 0.35f, 0.56f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(22.08f)
                curveToRelative(-0.07f, 0.21f, -0.19f, 0.4f, -0.35f, 0.56f)
                lineToRelative(-5.09f, 5.09f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(5.09f, -5.09f)
                curveToRelative(0.25f, -0.25f, 0.44f, -0.55f, 0.56f, -0.87f)
                verticalLineToRelative(5.6f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _ArrowToRight = it}
