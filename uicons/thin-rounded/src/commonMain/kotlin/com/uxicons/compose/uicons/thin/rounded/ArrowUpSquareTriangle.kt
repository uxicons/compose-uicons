package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpSquareTriangle: ImageVector? = null

val Icons.Tr.ArrowUpSquareTriangle: ImageVector
    get() = _ArrowUpSquareTriangle ?: UXIcon(name = "ArrowUpSquareTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 10f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(14f, 7.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(15f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(22f, 7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(15f, 3.5f)
                close()
                moveTo(23.73f, 19.87f)
                lineToRelative(-3.38f, -5.52f)
                curveToRelative(-0.37f, -0.69f, -1.06f, -1.1f, -1.85f, -1.1f)
                reflectiveCurveToRelative(-1.48f, 0.41f, -1.84f, 1.08f)
                lineToRelative(-3.41f, 5.56f)
                curveToRelative(-0.36f, 0.66f, -0.34f, 1.44f, 0.04f, 2.08f)
                curveToRelative(0.38f, 0.64f, 1.06f, 1.03f, 1.81f, 1.03f)
                horizontalLineToRelative(6.79f)
                curveToRelative(0.75f, 0f, 1.43f, -0.38f, 1.81f, -1.03f)
                curveToRelative(0.38f, -0.64f, 0.4f, -1.42f, 0.03f, -2.1f)
                close()
                moveTo(22.84f, 21.46f)
                curveToRelative(-0.2f, 0.34f, -0.56f, 0.54f, -0.95f, 0.54f)
                horizontalLineToRelative(-6.79f)
                curveToRelative(-0.39f, 0f, -0.75f, -0.2f, -0.95f, -0.54f)
                curveToRelative(-0.2f, -0.34f, -0.21f, -0.74f, -0.04f, -1.07f)
                lineToRelative(3.41f, -5.56f)
                curveToRelative(0.2f, -0.36f, 0.56f, -0.58f, 0.97f, -0.58f)
                reflectiveCurveToRelative(0.77f, 0.22f, 0.98f, 0.6f)
                lineToRelative(3.38f, 5.52f)
                curveToRelative(0.19f, 0.35f, 0.18f, 0.75f, -0.02f, 1.09f)
                close()
                moveTo(10.85f, 4.32f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(6.56f, 1.44f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.27f, -0.56f, -0.34f)
                lineTo(6f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(5f, 1.1f)
                curveToRelative(-0.21f, 0.07f, -0.4f, 0.18f, -0.56f, 0.34f)
                lineTo(0.85f, 5.03f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, -0.51f, 0f, -0.71f)
                lineTo(3.73f, 0.73f)
                curveToRelative(0.94f, -0.94f, 2.59f, -0.94f, 3.54f, 0f)
                lineToRelative(3.59f, 3.58f)
                close()
            }
        }.also { _ArrowUpSquareTriangle = it}
