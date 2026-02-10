package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DropDown: ImageVector? = null

val Icons.Sc.DropDown: ImageVector
    get() = _DropDown ?: UXIcon(name = "DropDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.98f, 11f)
                horizontalLineToRelative(-15.97f)
                curveToRelative(-0.01f, 0.33f, -0.02f, 0.67f, -0.02f, 1f)
                curveToRelative(0f, 4.5f, 0.98f, 9.24f, 1.02f, 9.44f)
                curveToRelative(0.06f, 0.3f, 0.26f, 0.56f, 0.54f, 0.69f)
                curveToRelative(0.18f, 0.09f, 1.9f, 0.87f, 6.44f, 0.87f)
                reflectiveCurveToRelative(6.26f, -0.78f, 6.44f, -0.87f)
                curveToRelative(0.28f, -0.14f, 0.47f, -0.39f, 0.54f, -0.69f)
                curveToRelative(0.04f, -0.2f, 1.02f, -4.94f, 1.02f, -9.44f)
                curveToRelative(0f, -0.33f, -0.01f, -0.67f, -0.02f, -1f)
                close()
                moveTo(9f, 20f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(12f, 16f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(22.18f, 2.73f)
                curveToRelative(-0.1f, -0.35f, -0.39f, -0.62f, -0.75f, -0.7f)
                curveToRelative(-0.19f, -0.04f, -4.94f, -1.02f, -9.44f, -1.02f)
                reflectiveCurveToRelative(-9.02f, 0.98f, -9.21f, 1.02f)
                curveToRelative(-0.38f, 0.08f, -0.68f, 0.38f, -0.76f, 0.76f)
                curveToRelative(-0.03f, 0.15f, -0.63f, 2.89f, -0.89f, 6.21f)
                horizontalLineToRelative(20.87f)
                curveToRelative(0.58f, 0f, 1.04f, -0.5f, 1.0f, -1.08f)
                curveToRelative(-0.23f, -3.08f, -0.78f, -5.09f, -0.81f, -5.19f)
                close()
                moveTo(19.83f, 5.2f)
                curveToRelative(-0.52f, 0.63f, -1.14f, 1.18f, -1.83f, 1.65f)
                curveToRelative(-0.15f, 0.1f, -0.32f, 0.15f, -0.5f, 0.15f)
                reflectiveCurveToRelative(-0.35f, -0.05f, -0.5f, -0.15f)
                curveToRelative(-0.7f, -0.47f, -1.31f, -1.02f, -1.83f, -1.65f)
                curveToRelative(-0.19f, -0.23f, -0.22f, -0.53f, -0.08f, -0.79f)
                reflectiveCurveToRelative(0.43f, -0.41f, 0.74f, -0.41f)
                horizontalLineToRelative(3.33f)
                curveToRelative(0.32f, 0f, 0.6f, 0.16f, 0.74f, 0.41f)
                reflectiveCurveToRelative(0.11f, 0.56f, -0.08f, 0.79f)
                close()
            }
        }.also { _DropDown = it}
