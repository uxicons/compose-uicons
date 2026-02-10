package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteUser: ImageVector? = null

val Icons.Rc.DeleteUser: ImageVector
    get() = _DeleteUser ?: UXIcon(name = "DeleteUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.97f, 13.66f)
                curveToRelative(-5.33f, 0.03f, -8.2f, 2.91f, -8.29f, 8.32f)
                curveToRelative(-0.01f, 0.55f, 0.43f, 1.01f, 0.98f, 1.02f)
                curveToRelative(0.55f, 0.0f, 1.01f, -0.43f, 1.02f, -0.98f)
                curveToRelative(0.08f, -4.31f, 2.08f, -6.33f, 6.29f, -6.36f)
                curveToRelative(4.17f, 0.03f, 6.23f, 2.1f, 6.3f, 6.36f)
                curveToRelative(0.01f, 0.55f, 0.46f, 0.98f, 1f, 0.98f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.55f, -0.01f, 0.99f, -0.47f, 0.98f, -1.02f)
                curveToRelative(-0.09f, -5.33f, -3.04f, -8.29f, -8.3f, -8.32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.79f, 12.7f)
                lineToRelative(1.25f, -1.25f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-1.25f, 1.25f)
                lineToRelative(-1.25f, -1.25f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(-1.25f, 1.25f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1.25f, -1.25f)
                lineToRelative(1.25f, 1.25f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1.25f, -1.25f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.98f, 12.31f)
                curveToRelative(3.61f, -0.02f, 5.55f, -1.97f, 5.62f, -5.67f)
                curveToRelative(-0.06f, -3.56f, -2.11f, -5.61f, -5.63f, -5.64f)
                curveToRelative(-3.56f, 0.02f, -5.62f, 2.18f, -5.62f, 5.64f)
                curveToRelative(0f, 3.61f, 2.06f, 5.65f, 5.63f, 5.67f)
                close()
                moveTo(9.97f, 3f)
                curveToRelative(2.44f, 0.02f, 3.59f, 1.18f, 3.63f, 3.64f)
                curveToRelative(-0.05f, 2.56f, -1.13f, 3.66f, -3.62f, 3.67f)
                curveToRelative(-2.49f, -0.01f, -3.58f, -1.11f, -3.63f, -3.65f)
                curveToRelative(0.05f, -2.51f, 1.17f, -3.64f, 3.62f, -3.65f)
                close()
            }
        }.also { _DeleteUser = it}
