package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramPredecessor: ImageVector? = null

val Icons.Ts.DiagramPredecessor: ImageVector
    get() = _DiagramPredecessor ?: UXIcon(name = "DiagramPredecessor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(21.5f, 24f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                lineTo(0f, 15f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(1f, 16f)
                lineTo(23f, 16f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(14f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.58f)
                lineToRelative(3.1f, 3.56f)
                curveToRelative(0.25f, 0.28f, 0.61f, 0.44f, 0.99f, 0.44f)
                reflectiveCurveToRelative(0.74f, -0.16f, 1f, -0.45f)
                lineToRelative(3.07f, -3.55f)
                horizontalLineToRelative(-3.58f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, -0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(6.5f)
                lineTo(14f, 9f)
                lineTo(14f, 5f)
                close()
                moveTo(20.26f, 11.89f)
                curveToRelative(-0.17f, 0.19f, -0.33f, 0.19f, -0.49f, 0f)
                lineToRelative(-1.65f, -1.89f)
                horizontalLineToRelative(3.78f)
                lineToRelative(-1.63f, 1.89f)
                close()
                moveTo(13f, 2.5f)
                verticalLineToRelative(0.79f)
                lineToRelative(-4.71f, 4.71f)
                horizontalLineToRelative(-3.59f)
                lineTo(11.69f, 1.01f)
                curveToRelative(0.74f, 0.1f, 1.31f, 0.73f, 1.31f, 1.49f)
                close()
                moveTo(2.5f, 1f)
                horizontalLineToRelative(2.79f)
                lineTo(1f, 5.29f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 6.71f)
                lineTo(6.71f, 1f)
                horizontalLineToRelative(3.59f)
                lineTo(3.29f, 8f)
                lineTo(1f, 8f)
                verticalLineToRelative(-1.29f)
                close()
                moveTo(9.71f, 8f)
                lineToRelative(3.29f, -3.29f)
                verticalLineToRelative(3.29f)
                horizontalLineToRelative(-3.29f)
                close()
            }
        }.also { _DiagramPredecessor = it}
