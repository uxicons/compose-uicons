package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resources: ImageVector? = null

val Icons.Tr.Resources: ImageVector
    get() = _Resources ?: UXIcon(name = "Resources") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.71f)
                lineToRelative(-3.14f, -5.21f)
                curveToRelative(-0.36f, -0.62f, -1.01f, -1.0f, -1.73f, -1.0f)
                reflectiveCurveToRelative(-1.37f, 0.37f, -1.73f, 1.0f)
                lineTo(0.27f, 10.96f)
                curveToRelative(-0.36f, 0.64f, -0.36f, 1.39f, 0.01f, 2.02f)
                curveToRelative(0.37f, 0.63f, 1.02f, 1.01f, 1.75f, 1.01f)
                horizontalLineToRelative(3.26f)
                curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -0.69f, -0.1f, -1.37f, -0.29f, -2f)
                horizontalLineToRelative(1.79f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(2.03f, 13f)
                curveToRelative(-0.37f, 0f, -0.7f, -0.19f, -0.89f, -0.51f)
                curveToRelative(-0.19f, -0.32f, -0.19f, -0.7f, -0.0f, -1.03f)
                lineTo(6.26f, 2.5f)
                curveToRelative(0.36f, -0.63f, 1.37f, -0.63f, 1.74f, 0.01f)
                lineToRelative(3.92f, 6.49f)
                curveToRelative(-2.75f, 0.03f, -5.13f, 1.66f, -6.24f, 4.0f)
                horizontalLineToRelative(-3.65f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(23f, 10.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.18f)
                curveToRelative(-0.99f, -2.08f, -2.97f, -3.59f, -5.32f, -3.93f)
                verticalLineToRelative(-3.57f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _Resources = it}
