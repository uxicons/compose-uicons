package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadVr: ImageVector? = null

val Icons.Tr.HeadVr: ImageVector
    get() = _HeadVr ?: UXIcon(name = "HeadVr") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 6f)
                horizontalLineToRelative(-0.69f)
                curveToRelative(-0.34f, -0.66f, -0.83f, -1.34f, -1.04f, -1.6f)
                curveTo(17.35f, 1.16f, 13.33f, -0.48f, 9.32f, 0.13f)
                curveTo(4.5f, 0.85f, 0.44f, 5.29f, 0.07f, 10.23f)
                curveToRelative(-0.2f, 2.7f, 0.48f, 5.21f, 1.97f, 7.26f)
                curveToRelative(0.63f, 0.86f, 0.96f, 1.81f, 0.96f, 2.73f)
                verticalLineToRelative(1.11f)
                curveToRelative(0f, 1.52f, 1.07f, 2.67f, 2.5f, 2.67f)
                lineTo(13.5f, 24f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.06f)
                curveToRelative(2.19f, 0f, 4.06f, -1.57f, 4.43f, -3.73f)
                lineToRelative(0.12f, -0.69f)
                curveToRelative(0.05f, -0.27f, -0.14f, -0.53f, -0.41f, -0.58f)
                curveToRelative(-0.27f, -0.06f, -0.53f, 0.13f, -0.58f, 0.41f)
                lineToRelative(-0.12f, 0.69f)
                curveToRelative(-0.29f, 1.68f, -1.74f, 2.9f, -3.45f, 2.9f)
                horizontalLineToRelative(-1.56f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 23.0f)
                curveToRelative(-0.87f, 0f, -1.5f, -0.7f, -1.5f, -1.67f)
                verticalLineToRelative(-1.11f)
                curveToRelative(0f, -1.14f, -0.4f, -2.29f, -1.15f, -3.32f)
                curveToRelative(-1.35f, -1.86f, -1.96f, -4.14f, -1.78f, -6.6f)
                curveToRelative(0.01f, -0.1f, 0.02f, -0.2f, 0.03f, -0.3f)
                lineTo(11.04f, 10.0f)
                curveToRelative(0.24f, 1.69f, 1.7f, 3f, 3.46f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9.47f, 1.12f)
                curveToRelative(3.66f, -0.55f, 7.3f, 0.94f, 9.52f, 3.9f)
                curveToRelative(0.12f, 0.15f, 0.41f, 0.55f, 0.68f, 0.98f)
                horizontalLineToRelative(-5.16f)
                curveToRelative(-1.76f, 0f, -3.22f, 1.31f, -3.46f, 3f)
                lineTo(1.26f, 9.0f)
                curveTo(2.13f, 5.05f, 5.52f, 1.71f, 9.47f, 1.12f)
                close()
                moveTo(23f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _HeadVr = it}
