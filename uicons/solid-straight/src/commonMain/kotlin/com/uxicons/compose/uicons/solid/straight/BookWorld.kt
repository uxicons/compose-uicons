package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookWorld: ImageVector? = null

val Icons.Ss.BookWorld: ImageVector
    get() = _BookWorld ?: UXIcon(name = "BookWorld") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 10f)
                lineTo(13f, 10f)
                lineTo(13f, 4.14f)
                curveToRelative(0f, -1.38f, 0.93f, -2.57f, 2.27f, -2.91f)
                lineTo(19.89f, 0.07f)
                curveToRelative(1.52f, -0.43f, 3.16f, 0.85f, 3.11f, 2.43f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(11f, 4.14f)
                curveToRelative(0f, -1.38f, -0.93f, -2.57f, -2.27f, -2.91f)
                lineTo(4.11f, 0.07f)
                curveTo(2.59f, -0.35f, 0.96f, 0.92f, 1f, 2.5f)
                verticalLineToRelative(7.5f)
                lineTo(11f, 10f)
                lineTo(11f, 4.14f)
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
                moveTo(8.77f, 17f)
                curveToRelative(1.02f, 2.09f, 2.41f, 3.73f, 3.23f, 4.59f)
                curveToRelative(0.81f, -0.86f, 2.2f, -2.5f, 3.22f, -4.59f)
                horizontalLineToRelative(-6.45f)
                close()
                moveTo(9.39f, 21.64f)
                curveToRelative(-0.94f, -1.17f, -2.02f, -2.77f, -2.81f, -4.64f)
                lineTo(3.35f, 17f)
                curveToRelative(1.31f, 2.25f, 3.47f, 3.94f, 6.04f, 4.64f)
                close()
                moveTo(20.65f, 17f)
                horizontalLineToRelative(-3.23f)
                curveToRelative(-0.79f, 1.88f, -1.87f, 3.48f, -2.81f, 4.64f)
                curveToRelative(2.57f, -0.7f, 4.73f, -2.39f, 6.04f, -4.64f)
                close()
            }
        }.also { _BookWorld = it}
