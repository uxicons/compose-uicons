package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Module: ImageVector? = null

val Icons.Rs.Module: ImageVector
    get() = _Module ?: UXIcon(name = "Module") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.99f, 11.58f)
                lineToRelative(6.01f, -3.45f)
                verticalLineToRelative(2.14f)
                curveToRelative(0.64f, -0.17f, 1.31f, -0.26f, 2f, -0.26f)
                verticalLineToRelative(-4.87f)
                lineTo(9f, -0.02f)
                lineTo(0f, 5.13f)
                verticalLineToRelative(11.72f)
                lineToRelative(9f, 5.14f)
                lineToRelative(1f, -0.57f)
                lineToRelative(-0.01f, -9.84f)
                close()
                moveTo(15.59f, 6.05f)
                lineToRelative(-6.61f, 3.79f)
                lineToRelative(-6.62f, -3.77f)
                lineToRelative(6.64f, -3.79f)
                lineToRelative(6.59f, 3.77f)
                close()
                moveTo(2f, 15.68f)
                verticalLineToRelative(-7.51f)
                lineToRelative(5.99f, 3.41f)
                lineToRelative(0.01f, 7.53f)
                lineToRelative(-6.0f, -3.43f)
                close()
                moveTo(22.5f, 18f)
                curveToRelative(0f, -0.46f, -0.09f, -0.9f, -0.22f, -1.31f)
                lineToRelative(1.42f, -0.82f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(-1.41f, 0.81f)
                curveToRelative(-0.6f, -0.65f, -1.39f, -1.12f, -2.29f, -1.33f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.62f)
                curveToRelative(-0.9f, 0.2f, -1.69f, 0.68f, -2.29f, 1.33f)
                lineToRelative(-1.41f, -0.81f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(1.42f, 0.82f)
                curveToRelative(-0.13f, 0.42f, -0.22f, 0.85f, -0.22f, 1.31f)
                reflectiveCurveToRelative(0.09f, 0.9f, 0.22f, 1.31f)
                lineToRelative(-1.42f, 0.82f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(1.41f, -0.81f)
                curveToRelative(0.6f, 0.65f, 1.39f, 1.12f, 2.29f, 1.33f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.62f)
                curveToRelative(0.9f, -0.2f, 1.69f, -0.68f, 2.29f, -1.33f)
                lineToRelative(1.41f, 0.81f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-1.42f, -0.82f)
                curveToRelative(0.13f, -0.42f, 0.22f, -0.85f, 0.22f, -1.31f)
                close()
                moveTo(18f, 20.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _Module = it}
