package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFingerClick: ImageVector? = null

val Icons.Rs.CursorFingerClick: ImageVector
    get() = _CursorFingerClick ?: UXIcon(name = "CursorFingerClick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19.77f, 3.62f)
                lineTo(18.35f, 2.22f)
                lineTo(14.83f, 5.77f)
                lineTo(16.25f, 7.18f)
                close()
                moveTo(17.0f, 11.01f)
                lineTo(22.0f, 10.99f)
                lineTo(22.0f, 8.99f)
                lineTo(17.0f, 9.01f)
                close()
                moveTo(9.17f, 5.77f)
                lineTo(5.65f, 2.22f)
                lineTo(4.23f, 3.62f)
                lineTo(7.75f, 7.18f)
                close()
                moveTo(7.0f, 9.01f)
                lineTo(2.0f, 8.99f)
                lineTo(2.0f, 10.99f)
                lineTo(7.0f, 11.01f)
                close()
                moveTo(15f, 15.27f)
                verticalLineToRelative(-5.16f)
                curveToRelative(0f, -1.52f, -1.08f, -2.83f, -2.5f, -3.07f)
                curveToRelative(-1.77f, -0.33f, -3.54f, 1.16f, -3.5f, 2.96f)
                verticalLineToRelative(8.63f)
                lineToRelative(-1.01f, -0.81f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-1.21f, -1.07f, -3.06f, -1.0f, -4.17f, 0.19f)
                curveToRelative(-1.13f, 1.21f, -1.07f, 3.11f, 0.13f, 4.23f)
                lineToRelative(1.78f, 1.75f)
                horizontalLineToRelative(2.88f)
                lineToRelative(-3.29f, -3.2f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.05f, -1.42f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.42f, 1.41f, -0.05f)
                curveToRelative(0.02f, 0.02f, 0.05f, 0.03f, 0.07f, 0.04f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(4.26f, 3.39f)
                verticalLineToRelative(-12.78f)
                curveToRelative(-0.01f, -0.61f, 0.57f, -1.1f, 1.18f, -0.99f)
                curveToRelative(0.46f, 0.08f, 0.82f, 0.56f, 0.82f, 1.09f)
                verticalLineToRelative(6.55f)
                lineToRelative(8f, 3f)
                verticalLineToRelative(4.35f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.73f)
                lineToRelative(-8f, -3f)
                close()
            }
        }.also { _CursorFingerClick = it}
