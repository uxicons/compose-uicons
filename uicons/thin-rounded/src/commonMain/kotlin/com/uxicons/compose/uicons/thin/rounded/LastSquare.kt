package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LastSquare: ImageVector? = null

val Icons.Tr.LastSquare: ImageVector
    get() = _LastSquare ?: UXIcon(name = "LastSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(16.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.4f)
                curveToRelative(-0.04f, -0.04f, -0.08f, -0.09f, -0.13f, -0.12f)
                lineToRelative(-5.5f, -3.5f)
                curveToRelative(-0.45f, -0.33f, -1.04f, -0.38f, -1.55f, -0.12f)
                curveToRelative(-0.51f, 0.26f, -0.82f, 0.77f, -0.82f, 1.33f)
                verticalLineToRelative(7.01f)
                curveToRelative(0f, 0.57f, 0.32f, 1.08f, 0.82f, 1.33f)
                curveToRelative(0.22f, 0.11f, 0.45f, 0.16f, 0.68f, 0.16f)
                curveToRelative(0.31f, 0f, 0.61f, -0.1f, 0.85f, -0.28f)
                lineToRelative(5.54f, -3.52f)
                curveToRelative(0.04f, -0.03f, 0.07f, -0.07f, 0.1f, -0.1f)
                verticalLineToRelative(2.4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.33f, 12.38f)
                lineToRelative(-5.54f, 3.52f)
                curveToRelative(-0.15f, 0.11f, -0.35f, 0.13f, -0.52f, 0.04f)
                reflectiveCurveToRelative(-0.27f, -0.25f, -0.27f, -0.44f)
                verticalLineToRelative(-7.01f)
                curveToRelative(0f, -0.19f, 0.1f, -0.35f, 0.27f, -0.44f)
                curveToRelative(0.07f, -0.04f, 0.15f, -0.05f, 0.22f, -0.05f)
                curveToRelative(0.1f, 0f, 0.2f, 0.03f, 0.29f, 0.1f)
                lineToRelative(5.51f, 3.5f)
                curveToRelative(0.13f, 0.09f, 0.2f, 0.24f, 0.2f, 0.4f)
                reflectiveCurveToRelative(-0.07f, 0.3f, -0.17f, 0.38f)
                close()
                moveTo(17f, 15.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _LastSquare = it}
