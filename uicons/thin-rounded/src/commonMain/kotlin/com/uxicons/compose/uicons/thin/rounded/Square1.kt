package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square1: ImageVector? = null

val Icons.Tr.Square1: ImageVector
    get() = _Square1 ?: UXIcon(name = "Square1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 24f)
                horizontalLineTo(4.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineTo(4.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(4.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(4.5f)
                close()
                moveTo(13f, 17.5f)
                verticalLineTo(7.08f)
                curveToRelative(0f, -0.44f, -0.26f, -0.83f, -0.66f, -0.99f)
                curveToRelative(-0.4f, -0.17f, -0.86f, -0.08f, -1.23f, 0.3f)
                lineToRelative(-2.02f, 2.83f)
                curveToRelative(-0.16f, 0.23f, -0.11f, 0.54f, 0.12f, 0.7f)
                reflectiveCurveToRelative(0.54f, 0.11f, 0.7f, -0.12f)
                lineToRelative(1.99f, -2.8f)
                lineToRelative(0.1f, 0.08f)
                verticalLineToRelative(10.42f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
        }.also { _Square1 = it}
