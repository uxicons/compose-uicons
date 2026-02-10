package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromBottom: ImageVector? = null

val Icons.Tr.ArrowFromBottom: ImageVector
    get() = _ArrowFromBottom ?: UXIcon(name = "ArrowFromBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                verticalLineTo(1.1f)
                curveToRelative(-0.2f, 0.07f, -0.4f, 0.18f, -0.56f, 0.34f)
                lineToRelative(-4.6f, 4.6f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, -0.51f, 0f, -0.71f)
                lineTo(10.23f, 0.73f)
                curveTo(10.72f, 0.25f, 11.35f, 0.0f, 11.99f, 0.0f)
                curveToRelative(0.0f, 0f, 0.01f, -0.0f, 0.01f, -0.0f)
                curveToRelative(0.0f, 0f, 0.01f, 0.0f, 0.01f, 0.0f)
                curveToRelative(0.64f, 0.0f, 1.27f, 0.25f, 1.76f, 0.73f)
                lineToRelative(4.6f, 4.6f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(13.06f, 1.44f)
                curveToRelative(-0.16f, -0.16f, -0.36f, -0.27f, -0.56f, -0.34f)
                verticalLineToRelative(21.9f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _ArrowFromBottom = it}
