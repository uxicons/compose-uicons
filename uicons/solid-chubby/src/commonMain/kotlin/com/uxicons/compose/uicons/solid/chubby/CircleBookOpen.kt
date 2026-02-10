package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBookOpen: ImageVector? = null

val Icons.Sc.CircleBookOpen: ImageVector
    get() = _CircleBookOpen ?: UXIcon(name = "CircleBookOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 9f)
                curveToRelative(0.39f, 0f, 0.72f, 0.11f, 1f, 0.23f)
                verticalLineToRelative(5.55f)
                lineToRelative(-2.44f, -0.5f)
                curveToRelative(-0.24f, -0.05f, -0.39f, -0.21f, -0.41f, -0.34f)
                curveToRelative(-0.07f, -0.49f, -0.15f, -1.27f, -0.15f, -2.19f)
                curveToRelative(0f, -1.0f, 0.1f, -1.92f, 0.17f, -2.49f)
                curveToRelative(0.49f, -0.12f, 1.21f, -0.26f, 1.82f, -0.26f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(18f, 11.75f)
                curveToRelative(0f, -1.87f, -0.31f, -3.49f, -0.31f, -3.5f)
                curveToRelative(-0.08f, -0.35f, -0.34f, -0.64f, -0.68f, -0.74f)
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
                close()
                moveTo(14f, 9f)
                curveToRelative(-0.39f, 0f, -0.72f, 0.11f, -1f, 0.23f)
                verticalLineToRelative(5.55f)
                lineToRelative(2.44f, -0.5f)
                curveToRelative(0.24f, -0.05f, 0.39f, -0.21f, 0.41f, -0.34f)
                curveToRelative(0.07f, -0.49f, 0.15f, -1.27f, 0.15f, -2.18f)
                curveToRelative(0f, -0.99f, -0.1f, -1.92f, -0.17f, -2.49f)
                curveToRelative(-0.49f, -0.12f, -1.21f, -0.26f, -1.82f, -0.26f)
                close()
            }
        }.also { _CircleBookOpen = it}
