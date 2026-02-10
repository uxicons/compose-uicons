package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromTop: ImageVector? = null

val Icons.Tr.ArrowFromTop: ImageVector
    get() = _ArrowFromTop ?: UXIcon(name = "ArrowFromTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.94f, 22.56f)
                lineToRelative(-5.09f, -5.09f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(5.08f, 5.09f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.29f, -0.26f, 1.77f, -0.73f)
                lineToRelative(5.09f, -5.09f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-5.09f, 5.09f)
                curveToRelative(-0.16f, 0.16f, -0.35f, 0.26f, -0.56f, 0.33f)
                verticalLineTo(1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                verticalLineTo(22.89f)
                curveToRelative(-0.21f, -0.07f, -0.4f, -0.17f, -0.56f, -0.33f)
                close()
            }
        }.also { _ArrowFromTop = it}
