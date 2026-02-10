package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eyes: ImageVector? = null

val Icons.Sc.Eyes: ImageVector
    get() = _Eyes ?: UXIcon(name = "Eyes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(0f, 5.44f, -0.65f, 11f, -5.5f, 11f)
                curveToRelative(-3.44f, 0f, -4.77f, -2.81f, -5.25f, -6.39f)
                curveToRelative(0.46f, 0.26f, 1.04f, 0.39f, 1.75f, 0.39f)
                curveToRelative(1.99f, 0f, 3f, -1.01f, 3f, -3f)
                reflectiveCurveToRelative(-1.01f, -3f, -3f, -3f)
                curveToRelative(-0.85f, 0f, -1.51f, 0.19f, -2.0f, 0.56f)
                curveToRelative(0.04f, -5.29f, 0.78f, -10.56f, 5.5f, -10.56f)
                curveToRelative(4.85f, 0f, 5.5f, 5.56f, 5.5f, 11f)
                close()
                moveTo(4f, 14f)
                curveToRelative(0f, -0.88f, -0.12f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.12f, -1f, 1f)
                reflectiveCurveToRelative(0.12f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.12f, 1f, -1f)
                close()
                moveTo(17.5f, 1f)
                curveToRelative(-4.71f, 0f, -5.46f, 5.26f, -5.5f, 10.56f)
                curveToRelative(0.49f, -0.36f, 1.15f, -0.56f, 2.0f, -0.56f)
                curveToRelative(1.99f, 0f, 3f, 1.01f, 3f, 3f)
                reflectiveCurveToRelative(-1.01f, 3f, -3f, 3f)
                curveToRelative(-0.71f, 0f, -1.29f, -0.13f, -1.75f, -0.39f)
                curveToRelative(0.48f, 3.58f, 1.8f, 6.39f, 5.25f, 6.39f)
                curveToRelative(4.85f, 0f, 5.5f, -5.56f, 5.5f, -11f)
                reflectiveCurveToRelative(-0.65f, -11f, -5.5f, -11f)
                close()
                moveTo(15f, 14f)
                curveToRelative(0f, -0.88f, -0.12f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.12f, -1f, 1f)
                reflectiveCurveToRelative(0.12f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.12f, 1f, -1f)
                close()
            }
        }.also { _Eyes = it}
