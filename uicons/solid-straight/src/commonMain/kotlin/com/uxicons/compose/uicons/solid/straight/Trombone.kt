package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trombone: ImageVector? = null

val Icons.Ss.Trombone: ImageVector
    get() = _Trombone ?: UXIcon(name = "Trombone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 2f)
                curveToRelative(0f, 1.61f, -0.64f, 3.1f, -1.86f, 4.31f)
                curveToRelative(-1.74f, 1.74f, -4.49f, 2.69f, -7.64f, 2.69f)
                curveToRelative(0f, 0f, -0.5f, 0f, -0.5f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.51f)
                curveToRelative(-0.93f, 0f, -1.8f, 0.36f, -2.46f, 1.02f)
                curveToRelative(-0.66f, 0.66f, -1.03f, 1.54f, -1.03f, 2.48f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                lineToRelative(-2.5f, -1f)
                verticalLineToRelative(4f)
                lineToRelative(2.5f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.57f)
                curveToRelative(3.15f, 0f, 5.83f, 0.95f, 7.58f, 2.69f)
                curveToRelative(1.22f, 1.21f, 1.86f, 2.7f, 1.86f, 4.31f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(3.5f, 14f)
                curveToRelative(-0.82f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.4f, 0.16f, -0.78f, 0.44f, -1.07f)
                curveToRelative(0.28f, -0.28f, 0.66f, -0.44f, 1.05f, -0.44f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(14.5f, 16f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Trombone = it}
