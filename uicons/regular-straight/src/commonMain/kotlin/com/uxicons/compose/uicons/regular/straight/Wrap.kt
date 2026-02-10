package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wrap: ImageVector? = null

val Icons.Rs.Wrap: ImageVector
    get() = _Wrap ?: UXIcon(name = "Wrap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9.0f, 9.08f)
                lineToRelative(1.21f, 14.92f)
                horizontalLineToRelative(15.72f)
                lineToRelative(1.07f, -15f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
                moveTo(5.09f, 10.11f)
                curveToRelative(1.03f, 0.21f, 3.17f, 0.79f, 5.43f, 2.27f)
                curveToRelative(-1.77f, 1.62f, -3.46f, 3.82f, -4.69f, 6.84f)
                lineToRelative(-0.74f, -9.11f)
                close()
                moveTo(18.07f, 22f)
                horizontalLineToRelative(-11.1f)
                curveToRelative(2.68f, -9.04f, 9.26f, -11.29f, 11.94f, -11.83f)
                lineToRelative(-0.84f, 11.83f)
                close()
                moveTo(17.58f, 8.47f)
                curveToRelative(-0.52f, -0.88f, -1.48f, -1.47f, -2.58f, -1.47f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.36f, 0.02f, 0.74f, 0.14f, 1.07f)
                curveToRelative(-0.72f, -0.51f, -1.44f, -0.94f, -2.13f, -1.3f)
                curveToRelative(0.1f, -2.03f, 1.4f, -3.74f, 3.21f, -4.43f)
                curveToRelative(-0.64f, -0.81f, -1.62f, -1.34f, -2.73f, -1.34f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.38f, 0.08f, 0.74f, 0.2f, 1.09f)
                curveToRelative(-0.94f, -0.3f, -1.68f, -0.45f, -2.12f, -0.52f)
                curveToRelative(0.46f, -3.42f, 3.39f, -6.07f, 6.93f, -6.07f)
                curveToRelative(3.57f, 0f, 6.52f, 2.69f, 6.94f, 6.14f)
                curveToRelative(-0.37f, 0.07f, -0.83f, 0.17f, -1.37f, 0.32f)
                close()
            }
        }.also { _Wrap = it}
