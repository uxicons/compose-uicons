package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Language: ImageVector? = null

val Icons.Rs.Language: ImageVector
    get() = _Language ?: UXIcon(name = "Language") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.07f, 9.46f)
                lineToRelative(0.79f, 3.44f)
                horizontalLineToRelative(-1.76f)
                lineToRelative(0.81f, -3.44f)
                curveToRelative(0.01f, -0.04f, 0.04f, -0.06f, 0.08f, -0.06f)
                reflectiveCurveToRelative(0.07f, 0.03f, 0.08f, 0.06f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(13f)
                lineTo(0f, 20f)
                lineTo(0f, 7f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(9f, 16f)
                lineToRelative(-1.56f, -6.8f)
                curveToRelative(-0.11f, -0.46f, -0.4f, -0.89f, -0.84f, -1.07f)
                curveToRelative(-0.92f, -0.39f, -1.85f, 0.15f, -2.06f, 1.02f)
                lineToRelative(-1.62f, 6.85f)
                horizontalLineToRelative(1.44f)
                lineToRelative(0.4f, -1.7f)
                horizontalLineToRelative(2.41f)
                lineToRelative(0.39f, 1.7f)
                horizontalLineToRelative(1.44f)
                close()
                moveTo(22f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(10f)
                lineTo(22f, 7f)
                close()
                moveTo(17.63f, 8f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.87f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(4.81f)
                curveToRelative(-0.11f, 0.96f, -0.48f, 2.15f, -1.3f, 3.07f)
                curveToRelative(-0.36f, -0.41f, -0.64f, -0.86f, -0.85f, -1.32f)
                horizontalLineToRelative(-1.34f)
                curveToRelative(0.27f, 0.75f, 0.67f, 1.49f, 1.22f, 2.12f)
                curveToRelative(-0.66f, 0.4f, -1.5f, 0.66f, -2.54f, 0.66f)
                verticalLineToRelative(1.25f)
                curveToRelative(1.46f, 0f, 2.62f, -0.41f, 3.51f, -1.05f)
                curveToRelative(0.89f, 0.64f, 2.03f, 1.05f, 3.49f, 1.05f)
                verticalLineToRelative(-1.25f)
                curveToRelative(-1.05f, 0f, -1.88f, -0.26f, -2.54f, -0.67f)
                curveToRelative(0.99f, -1.14f, 1.49f, -2.59f, 1.61f, -3.87f)
                horizontalLineToRelative(0.93f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(-2.87f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Language = it}
