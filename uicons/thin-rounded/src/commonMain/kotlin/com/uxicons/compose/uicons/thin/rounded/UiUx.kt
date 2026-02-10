package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UiUx: ImageVector? = null

val Icons.Tr.UiUx: ImageVector
    get() = _UiUx ?: UXIcon(name = "UiUx") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.5f, 12.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(16.5f, 15f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(13.5f, 15f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(8.5f, 9f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(12f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(6f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(14.23f, 8.92f)
                curveToRelative(0.08f, 0.05f, 0.17f, 0.08f, 0.27f, 0.08f)
                curveToRelative(0.17f, 0f, 0.33f, -0.08f, 0.42f, -0.23f)
                lineToRelative(2.08f, -3.32f)
                lineToRelative(2.08f, 3.32f)
                curveToRelative(0.1f, 0.15f, 0.26f, 0.23f, 0.42f, 0.23f)
                curveToRelative(0.09f, 0f, 0.18f, -0.02f, 0.27f, -0.08f)
                curveToRelative(0.23f, -0.15f, 0.31f, -0.46f, 0.16f, -0.69f)
                lineToRelative(-2.33f, -3.73f)
                lineToRelative(2.33f, -3.73f)
                curveToRelative(0.15f, -0.23f, 0.07f, -0.54f, -0.16f, -0.69f)
                curveToRelative(-0.23f, -0.15f, -0.54f, -0.08f, -0.69f, 0.16f)
                lineToRelative(-2.08f, 3.32f)
                lineTo(14.92f, 0.23f)
                curveToRelative(-0.15f, -0.23f, -0.46f, -0.31f, -0.69f, -0.16f)
                curveToRelative(-0.23f, 0.15f, -0.31f, 0.46f, -0.16f, 0.69f)
                lineToRelative(2.33f, 3.73f)
                lineToRelative(-2.33f, 3.73f)
                curveToRelative(-0.15f, 0.23f, -0.07f, 0.54f, 0.16f, 0.69f)
                close()
            }
        }.also { _UiUx = it}
