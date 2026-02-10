package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EndlessLoop: ImageVector? = null

val Icons.Tr.EndlessLoop: ImageVector
    get() = _EndlessLoop ?: UXIcon(name = "EndlessLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14.5f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.36f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(6.26f)
                lineTo(8.65f, 1.85f)
                curveToRelative(-0.2f, -0.2f, -0.19f, -0.51f, 0.0f, -0.71f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.19f, 0.71f, 0.0f)
                lineToRelative(5.26f, 5.3f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.53f, 0f, 2.12f)
                lineToRelative(-5.26f, 5.29f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, -0.0f, -0.71f)
                lineToRelative(5.12f, -5.15f)
                horizontalLineToRelative(-6.26f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(9f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                curveToRelative(0f, -3.21f, -2.4f, -5.98f, -5.57f, -6.43f)
                curveToRelative(-0.27f, -0.04f, -0.46f, -0.29f, -0.42f, -0.57f)
                curveToRelative(0.04f, -0.27f, 0.29f, -0.46f, 0.57f, -0.42f)
                curveToRelative(3.67f, 0.52f, 6.43f, 3.72f, 6.43f, 7.42f)
                close()
            }
        }.also { _EndlessLoop = it}
