package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ValueAbsolute: ImageVector? = null

val Icons.Tc.ValueAbsolute: ImageVector
    get() = _ValueAbsolute ?: UXIcon(name = "ValueAbsolute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.85f, 8.85f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(3.15f, 3.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(-0.51f, 0.2f, -0.71f, 0f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-3.15f, 3.15f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(3.15f, -3.15f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(22.28f, 1.43f)
                curveToRelative(-0.04f, -0.27f, -0.29f, -0.46f, -0.57f, -0.42f)
                curveToRelative(-0.27f, 0.04f, -0.46f, 0.29f, -0.42f, 0.57f)
                curveToRelative(0.01f, 0.05f, 0.71f, 4.87f, 0.71f, 10.43f)
                reflectiveCurveToRelative(-0.7f, 10.38f, -0.71f, 10.43f)
                curveToRelative(-0.05f, 0.3f, 0.19f, 0.57f, 0.49f, 0.57f)
                curveToRelative(0.24f, 0f, 0.46f, -0.18f, 0.49f, -0.43f)
                curveToRelative(0.01f, -0.05f, 0.72f, -4.95f, 0.72f, -10.57f)
                reflectiveCurveToRelative(-0.72f, -10.52f, -0.72f, -10.57f)
                close()
                moveTo(2.29f, 1.01f)
                curveToRelative(-0.27f, -0.04f, -0.53f, 0.15f, -0.57f, 0.42f)
                curveToRelative(-0.01f, 0.05f, -0.72f, 4.95f, -0.72f, 10.57f)
                reflectiveCurveToRelative(0.72f, 10.52f, 0.72f, 10.57f)
                curveToRelative(0.04f, 0.27f, 0.3f, 0.46f, 0.57f, 0.42f)
                curveToRelative(0.27f, -0.04f, 0.46f, -0.29f, 0.42f, -0.57f)
                curveToRelative(-0.01f, -0.05f, -0.71f, -4.87f, -0.71f, -10.43f)
                reflectiveCurveToRelative(0.7f, -10.38f, 0.71f, -10.43f)
                curveToRelative(0.04f, -0.27f, -0.15f, -0.53f, -0.42f, -0.57f)
                close()
            }
        }.also { _ValueAbsolute = it}
