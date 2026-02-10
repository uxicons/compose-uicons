package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBookOpen: ImageVector? = null

val Icons.Rc.CircleBookOpen: ImageVector
    get() = _CircleBookOpen ?: UXIcon(name = "CircleBookOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
                moveTo(17.01f, 7.51f)
                curveToRelative(-0.07f, -0.02f, -1.65f, -0.51f, -3.01f, -0.51f)
                curveToRelative(-0.84f, 0f, -1.52f, 0.25f, -2f, 0.49f)
                curveToRelative(-0.48f, -0.24f, -1.16f, -0.49f, -2f, -0.49f)
                curveToRelative(-1.36f, 0f, -2.94f, 0.49f, -3.01f, 0.51f)
                curveToRelative(-0.34f, 0.11f, -0.6f, 0.39f, -0.68f, 0.74f)
                curveToRelative(-0.0f, 0.01f, -0.31f, 1.64f, -0.31f, 3.5f)
                curveToRelative(0f, 1.03f, 0.09f, 1.91f, 0.17f, 2.46f)
                curveToRelative(0.14f, 0.99f, 0.94f, 1.81f, 1.98f, 2.02f)
                lineToRelative(3.54f, 0.73f)
                curveToRelative(0.2f, 0.04f, 0.4f, 0.04f, 0.6f, 0f)
                lineToRelative(3.54f, -0.73f)
                curveToRelative(1.04f, -0.22f, 1.84f, -1.03f, 1.98f, -2.02f)
                curveToRelative(0.08f, -0.56f, 0.17f, -1.44f, 0.17f, -2.46f)
                curveToRelative(0f, -1.87f, -0.31f, -3.49f, -0.31f, -3.5f)
                curveToRelative(-0.08f, -0.35f, -0.34f, -0.64f, -0.68f, -0.74f)
                close()
                moveTo(8.15f, 13.94f)
                curveToRelative(-0.07f, -0.49f, -0.15f, -1.27f, -0.15f, -2.19f)
                curveToRelative(0f, -1.0f, 0.1f, -1.92f, 0.17f, -2.49f)
                curveToRelative(0.49f, -0.12f, 1.21f, -0.26f, 1.82f, -0.26f)
                curveToRelative(0.39f, 0f, 0.72f, 0.11f, 1f, 0.23f)
                verticalLineToRelative(5.55f)
                lineToRelative(-2.44f, -0.5f)
                curveToRelative(-0.24f, -0.05f, -0.39f, -0.21f, -0.41f, -0.34f)
                close()
                moveTo(15.85f, 13.94f)
                curveToRelative(-0.02f, 0.13f, -0.17f, 0.29f, -0.41f, 0.34f)
                lineToRelative(-2.44f, 0.5f)
                verticalLineToRelative(-5.55f)
                curveToRelative(0.28f, -0.13f, 0.61f, -0.23f, 1f, -0.23f)
                curveToRelative(0.62f, 0f, 1.33f, 0.14f, 1.82f, 0.26f)
                curveToRelative(0.08f, 0.57f, 0.17f, 1.5f, 0.17f, 2.49f)
                curveToRelative(0f, 0.91f, -0.08f, 1.69f, -0.15f, 2.18f)
                close()
            }
        }.also { _CircleBookOpen = it}
