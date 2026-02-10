package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ValueAbsolute: ImageVector? = null

val Icons.Rc.ValueAbsolute: ImageVector
    get() = _ValueAbsolute ?: UXIcon(name = "ValueAbsolute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, 5.4f, -0.67f, 9.96f, -0.69f, 10.15f)
                curveToRelative(-0.07f, 0.5f, -0.5f, 0.85f, -0.99f, 0.85f)
                curveToRelative(-0.6f, 0.01f, -1.08f, -0.55f, -0.99f, -1.15f)
                curveToRelative(0.01f, -0.05f, 0.67f, -4.61f, 0.67f, -9.85f)
                reflectiveCurveToRelative(-0.67f, -9.81f, -0.67f, -9.85f)
                curveToRelative(-0.08f, -0.55f, 0.3f, -1.05f, 0.84f, -1.14f)
                curveToRelative(0.55f, -0.07f, 1.05f, 0.3f, 1.14f, 0.84f)
                curveToRelative(0.03f, 0.19f, 0.69f, 4.75f, 0.69f, 10.15f)
                close()
                moveTo(2.83f, 1.01f)
                curveToRelative(-0.54f, -0.07f, -1.05f, 0.3f, -1.14f, 0.84f)
                curveToRelative(-0.03f, 0.19f, -0.69f, 4.75f, -0.69f, 10.15f)
                reflectiveCurveToRelative(0.67f, 9.96f, 0.69f, 10.15f)
                curveToRelative(0.07f, 0.5f, 0.5f, 0.85f, 0.99f, 0.85f)
                curveToRelative(0.6f, 0.01f, 1.08f, -0.55f, 0.99f, -1.15f)
                curveToRelative(-0.01f, -0.05f, -0.67f, -4.6f, -0.67f, -9.85f)
                reflectiveCurveToRelative(0.67f, -9.81f, 0.67f, -9.85f)
                curveToRelative(0.08f, -0.55f, -0.3f, -1.05f, -0.84f, -1.14f)
                close()
                moveTo(15.71f, 8.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-2.29f, -2.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(2.29f, 2.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _ValueAbsolute = it}
