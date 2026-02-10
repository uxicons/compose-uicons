package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookWorld: ImageVector? = null

val Icons.Rs.BookWorld: ImageVector
    get() = _BookWorld ?: UXIcon(name = "BookWorld") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 10f)
                lineTo(1f, 10f)
                lineTo(1f, 2.93f)
                curveTo(0.95f, 1.13f, 2.75f, -0.34f, 4.5f, 0.06f)
                lineToRelative(6.0f, 1.21f)
                curveToRelative(0.58f, 0.12f, 1.08f, 0.39f, 1.49f, 0.77f)
                curveToRelative(0.41f, -0.38f, 0.92f, -0.66f, 1.49f, -0.77f)
                lineTo(19.5f, 0.06f)
                curveToRelative(1.75f, -0.4f, 3.55f, 1.07f, 3.5f, 2.87f)
                verticalLineToRelative(7.07f)
                horizontalLineToRelative(-2f)
                lineTo(21f, 2.93f)
                curveToRelative(-0.11f, -0.71f, -0.39f, -0.94f, -1.11f, -0.91f)
                lineToRelative(-6.0f, 1.21f)
                curveToRelative(-0.51f, 0.1f, -0.89f, 0.56f, -0.89f, 1.08f)
                verticalLineToRelative(5.69f)
                horizontalLineToRelative(-2f)
                lineTo(11.0f, 4.31f)
                curveToRelative(0f, -0.53f, -0.37f, -0.98f, -0.89f, -1.08f)
                lineToRelative(-6.0f, -1.21f)
                curveToRelative(-0.71f, -0.04f, -1.01f, 0.2f, -1.11f, 0.91f)
                verticalLineToRelative(7.07f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                lineTo(2f, 12f)
                curveToRelative(0f, 1.04f, 0.16f, 2.05f, 0.46f, 3f)
                horizontalLineToRelative(3.44f)
                curveToRelative(-0.25f, -0.96f, -0.4f, -1.96f, -0.4f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.04f, 0.18f, 2.05f, 0.47f, 3f)
                horizontalLineToRelative(8.06f)
                curveToRelative(0.29f, -0.95f, 0.47f, -1.96f, 0.47f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.04f, -0.16f, 2.04f, -0.4f, 3f)
                horizontalLineToRelative(3.44f)
                curveToRelative(0.3f, -0.95f, 0.46f, -1.96f, 0.46f, -3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9.39f, 21.64f)
                curveToRelative(-0.94f, -1.17f, -2.02f, -2.77f, -2.81f, -4.64f)
                lineTo(3.35f, 17f)
                curveToRelative(1.31f, 2.25f, 3.47f, 3.94f, 6.04f, 4.64f)
                close()
                moveTo(15.22f, 17f)
                horizontalLineToRelative(-6.45f)
                curveToRelative(1.02f, 2.09f, 2.41f, 3.73f, 3.23f, 4.59f)
                curveToRelative(0.81f, -0.86f, 2.2f, -2.5f, 3.22f, -4.59f)
                close()
                moveTo(20.65f, 17f)
                horizontalLineToRelative(-3.23f)
                curveToRelative(-0.79f, 1.88f, -1.87f, 3.48f, -2.81f, 4.64f)
                curveToRelative(2.57f, -0.7f, 4.73f, -2.39f, 6.04f, -4.64f)
                close()
            }
        }.also { _BookWorld = it}
