package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Forward: ImageVector? = null

val Icons.Sc.Forward: ImageVector
    get() = _Forward ?: UXIcon(name = "Forward") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.44f, 10.5f)
                curveToRelative(-0.86f, -1.0f, -2.38f, -2.5f, -4.75f, -3.99f)
                curveToRelative(-1.96f, -1.23f, -3.69f, -1.87f, -4.81f, -2.2f)
                curveToRelative(-0.72f, -0.21f, -1.47f, -0.08f, -2.07f, 0.37f)
                curveToRelative(-0.6f, 0.45f, -0.94f, 1.13f, -0.94f, 1.87f)
                verticalLineToRelative(0.67f)
                curveToRelative(-0.34f, -0.24f, -0.7f, -0.47f, -1.06f, -0.7f)
                curveToRelative(-1.96f, -1.23f, -3.69f, -1.87f, -4.81f, -2.2f)
                curveToRelative(-0.72f, -0.21f, -1.47f, -0.08f, -2.07f, 0.37f)
                curveToRelative(-0.6f, 0.45f, -0.94f, 1.13f, -0.94f, 1.87f)
                verticalLineToRelative(10.91f)
                curveToRelative(0f, 0.74f, 0.34f, 1.42f, 0.94f, 1.87f)
                curveToRelative(0.6f, 0.45f, 1.35f, 0.58f, 2.07f, 0.37f)
                curveToRelative(1.11f, -0.33f, 2.85f, -0.98f, 4.81f, -2.2f)
                curveToRelative(0.36f, -0.23f, 0.71f, -0.46f, 1.06f, -0.7f)
                verticalLineToRelative(0.67f)
                curveToRelative(0f, 0.74f, 0.34f, 1.42f, 0.94f, 1.87f)
                curveToRelative(0.41f, 0.31f, 0.9f, 0.47f, 1.4f, 0.47f)
                curveToRelative(0.22f, 0f, 0.45f, -0.03f, 0.67f, -0.1f)
                curveToRelative(1.11f, -0.33f, 2.85f, -0.98f, 4.81f, -2.2f)
                curveToRelative(2.37f, -1.49f, 3.89f, -2.99f, 4.75f, -3.99f)
                curveToRelative(0.75f, -0.87f, 0.75f, -2.13f, 0f, -3.01f)
                close()
            }
        }.also { _Forward = it}
