package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eyes: ImageVector? = null

val Icons.Rc.Eyes: ImageVector
    get() = _Eyes ?: UXIcon(name = "Eyes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 1f)
                curveToRelative(-2.66f, 0f, -4.17f, 1.41f, -5f, 3.51f)
                curveToRelative(-0.83f, -2.1f, -2.34f, -3.51f, -5f, -3.51f)
                curveToRelative(-5.29f, 0f, -6f, 5.56f, -6f, 11f)
                reflectiveCurveToRelative(0.71f, 11f, 6f, 11f)
                curveToRelative(2.66f, 0f, 4.17f, -1.41f, 5f, -3.51f)
                curveToRelative(0.83f, 2.1f, 2.34f, 3.51f, 5f, 3.51f)
                curveToRelative(5.29f, 0f, 6f, -5.56f, 6f, -11f)
                reflectiveCurveToRelative(-0.71f, -11f, -6f, -11f)
                close()
                moveTo(13.1f, 14f)
                curveToRelative(0f, -0.92f, 0.15f, -1f, 0.95f, -1f)
                reflectiveCurveToRelative(0.95f, 0.08f, 0.95f, 1f)
                reflectiveCurveToRelative(-0.15f, 1f, -0.95f, 1f)
                reflectiveCurveToRelative(-0.95f, -0.08f, -0.95f, -1f)
                close()
                moveTo(3.1f, 14f)
                curveToRelative(0f, -0.92f, 0.15f, -1f, 0.95f, -1f)
                reflectiveCurveToRelative(0.95f, 0.08f, 0.95f, 1f)
                reflectiveCurveToRelative(-0.15f, 1f, -0.95f, 1f)
                reflectiveCurveToRelative(-0.95f, -0.08f, -0.95f, -1f)
                close()
                moveTo(7f, 21f)
                curveToRelative(-1.45f, 0f, -2.96f, -0.39f, -3.64f, -4.05f)
                curveToRelative(0.21f, 0.03f, 0.44f, 0.05f, 0.69f, 0.05f)
                curveToRelative(1.96f, 0f, 2.95f, -1.01f, 2.95f, -3f)
                reflectiveCurveToRelative(-0.99f, -3f, -2.95f, -3f)
                curveToRelative(-0.39f, 0f, -0.73f, 0.05f, -1.04f, 0.13f)
                curveToRelative(0.14f, -7.46f, 2.12f, -8.13f, 3.99f, -8.13f)
                curveToRelative(1.94f, 0f, 4f, 0.69f, 4f, 9f)
                reflectiveCurveToRelative(-2.06f, 9f, -4f, 9f)
                close()
                moveTo(17f, 21f)
                curveToRelative(-1.45f, 0f, -2.96f, -0.39f, -3.64f, -4.05f)
                curveToRelative(0.21f, 0.03f, 0.45f, 0.05f, 0.69f, 0.05f)
                curveToRelative(1.96f, 0f, 2.95f, -1.01f, 2.95f, -3f)
                reflectiveCurveToRelative(-0.99f, -3f, -2.95f, -3f)
                curveToRelative(-0.39f, 0f, -0.73f, 0.05f, -1.04f, 0.13f)
                curveToRelative(0.14f, -7.46f, 2.12f, -8.13f, 3.99f, -8.13f)
                curveToRelative(1.94f, 0f, 4f, 0.69f, 4f, 9f)
                reflectiveCurveToRelative(-2.06f, 9f, -4f, 9f)
                close()
            }
        }.also { _Eyes = it}
