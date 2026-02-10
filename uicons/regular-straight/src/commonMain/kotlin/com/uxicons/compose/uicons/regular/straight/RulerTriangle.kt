package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulerTriangle: ImageVector? = null

val Icons.Rs.RulerTriangle: ImageVector
    get() = _RulerTriangle ?: UXIcon(name = "RulerTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.29f, 19.87f)
                lineTo(4.13f, 0.71f)
                curveTo(3.43f, 0.02f, 2.4f, -0.19f, 1.49f, 0.19f)
                curveTo(0.58f, 0.56f, 0f, 1.44f, 0f, 2.42f)
                lineTo(0f, 24f)
                lineTo(21.58f, 24f)
                curveToRelative(0.98f, 0f, 1.86f, -0.59f, 2.23f, -1.49f)
                reflectiveCurveToRelative(0.17f, -1.94f, -0.52f, -2.63f)
                close()
                moveTo(21.96f, 21.74f)
                curveToRelative(-0.04f, 0.1f, -0.14f, 0.26f, -0.39f, 0.26f)
                lineTo(2f, 22f)
                lineTo(2f, 2.42f)
                curveToRelative(0f, -0.24f, 0.16f, -0.35f, 0.26f, -0.39f)
                curveToRelative(0.1f, -0.04f, 0.28f, -0.08f, 0.46f, 0.09f)
                lineToRelative(3.19f, 3.19f)
                lineToRelative(-1.87f, 1.87f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.87f, -1.87f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.87f, 1.87f)
                lineToRelative(0.05f, 0.05f)
                horizontalLineToRelative(0f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.87f, -1.87f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.87f, 1.87f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.87f, -1.87f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.87f, 1.87f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.87f, -1.87f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.87f, 1.87f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.87f, -1.87f)
                lineToRelative(3.19f, 3.19f)
                curveToRelative(0.17f, 0.17f, 0.13f, 0.36f, 0.09f, 0.46f)
                close()
                moveTo(6f, 12.59f)
                lineToRelative(5.41f, 5.41f)
                lineTo(6f, 18f)
                verticalLineToRelative(-5.41f)
                close()
            }
        }.also { _RulerTriangle = it}
