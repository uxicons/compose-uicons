package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandLizard: ImageVector? = null

val Icons.Bs.HandLizard: ImageVector
    get() = _HandLizard ?: UXIcon(name = "HandLizard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(12f, 24f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.17f, 0f, -2.29f, -0.51f, -3.05f, -1.41f)
                curveToRelative(-0.76f, -0.9f, -1.09f, -2.08f, -0.9f, -3.25f)
                curveToRelative(0.31f, -1.9f, 2.06f, -3.34f, 4.08f, -3.34f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.29f, 0f, 0.55f, -0.12f, 0.74f, -0.33f)
                curveToRelative(0.11f, -0.12f, 0.29f, -0.39f, 0.25f, -0.78f)
                curveToRelative(-0.05f, -0.49f, -0.56f, -0.89f, -1.14f, -0.89f)
                lineTo(4f, 8f)
                curveToRelative(-1.17f, 0f, -2.29f, -0.51f, -3.05f, -1.41f)
                curveTo(0.19f, 5.7f, -0.14f, 4.51f, 0.05f, 3.34f)
                curveTo(0.36f, 1.44f, 2.12f, 0f, 4.13f, 0f)
                horizontalLineToRelative(7.55f)
                curveToRelative(3.52f, 0f, 6.79f, 1.75f, 8.74f, 4.68f)
                lineToRelative(1.82f, 2.73f)
                curveToRelative(1.15f, 1.73f, 1.76f, 3.74f, 1.76f, 5.82f)
                verticalLineToRelative(10.77f)
                close()
                moveTo(15f, 21f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7.77f)
                curveToRelative(0f, -1.49f, -0.44f, -2.92f, -1.26f, -4.16f)
                lineToRelative(-1.82f, -2.73f)
                curveToRelative(-1.39f, -2.09f, -3.73f, -3.34f, -6.24f, -3.34f)
                lineTo(4.13f, 3f)
                curveToRelative(-0.55f, 0f, -1.04f, 0.36f, -1.12f, 0.82f)
                curveToRelative(-0.07f, 0.41f, 0.11f, 0.69f, 0.22f, 0.83f)
                curveToRelative(0.19f, 0.22f, 0.47f, 0.35f, 0.76f, 0.35f)
                horizontalLineToRelative(5.86f)
                curveToRelative(2.11f, 0f, 3.92f, 1.58f, 4.12f, 3.59f)
                curveToRelative(0.11f, 1.13f, -0.26f, 2.25f, -1.01f, 3.09f)
                reflectiveCurveToRelative(-1.84f, 1.32f, -2.97f, 1.32f)
                horizontalLineToRelative(-1.87f)
                curveToRelative(-0.55f, 0f, -1.04f, 0.36f, -1.12f, 0.82f)
                curveToRelative(-0.07f, 0.41f, 0.11f, 0.69f, 0.22f, 0.83f)
                curveToRelative(0.19f, 0.22f, 0.47f, 0.35f, 0.76f, 0.35f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _HandLizard = it}
