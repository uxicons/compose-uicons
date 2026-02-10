package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBookOpen: ImageVector? = null

val Icons.Sr.CircleBookOpen: ImageVector
    get() = _CircleBookOpen ?: UXIcon(name = "CircleBookOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 8.73f)
                verticalLineToRelative(5.51f)
                curveToRelative(0f, 0.44f, -0.3f, 0.84f, -0.72f, 0.96f)
                lineToRelative(-2.27f, 0.65f)
                verticalLineToRelative(-6.43f)
                curveToRelative(0f, -0.46f, 0.31f, -0.88f, 0.76f, -1.01f)
                lineToRelative(1.32f, -0.38f)
                curveToRelative(0.22f, -0.06f, 0.45f, -0.02f, 0.64f, 0.12f)
                curveToRelative(0.18f, 0.14f, 0.29f, 0.35f, 0.29f, 0.58f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(18f, 8.73f)
                curveToRelative(0f, -0.86f, -0.4f, -1.66f, -1.09f, -2.18f)
                curveToRelative(-0.69f, -0.52f, -1.56f, -0.68f, -2.4f, -0.44f)
                lineToRelative(-1.32f, 0.38f)
                curveToRelative(-0.46f, 0.13f, -0.86f, 0.37f, -1.2f, 0.67f)
                curveToRelative(-0.34f, -0.31f, -0.74f, -0.54f, -1.2f, -0.67f)
                lineToRelative(-1.32f, -0.38f)
                curveToRelative(-0.83f, -0.24f, -1.7f, -0.08f, -2.4f, 0.44f)
                curveToRelative(-0.69f, 0.52f, -1.09f, 1.31f, -1.09f, 2.18f)
                verticalLineToRelative(5.51f)
                curveToRelative(0f, 1.33f, 0.9f, 2.52f, 2.17f, 2.88f)
                lineToRelative(2.35f, 0.67f)
                curveToRelative(0.48f, 0.14f, 0.98f, 0.21f, 1.48f, 0.21f)
                reflectiveCurveToRelative(0.99f, -0.07f, 1.48f, -0.21f)
                lineToRelative(2.35f, -0.67f)
                curveToRelative(1.28f, -0.37f, 2.17f, -1.55f, 2.17f, -2.88f)
                verticalLineToRelative(-5.51f)
                close()
                moveTo(10.24f, 8.41f)
                lineToRelative(-1.32f, -0.38f)
                curveToRelative(-0.07f, -0.02f, -0.14f, -0.03f, -0.2f, -0.03f)
                curveToRelative(-0.15f, 0f, -0.31f, 0.05f, -0.43f, 0.15f)
                curveToRelative(-0.18f, 0.14f, -0.29f, 0.35f, -0.29f, 0.58f)
                verticalLineToRelative(5.51f)
                curveToRelative(0f, 0.44f, 0.3f, 0.84f, 0.72f, 0.96f)
                lineToRelative(2.28f, 0.65f)
                verticalLineToRelative(-6.43f)
                curveToRelative(0f, -0.46f, -0.31f, -0.88f, -0.76f, -1.01f)
                close()
            }
        }.also { _CircleBookOpen = it}
