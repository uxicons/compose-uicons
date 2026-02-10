package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ErrorCamera: ImageVector? = null

val Icons.Rs.ErrorCamera: ImageVector
    get() = _ErrorCamera ?: UXIcon(name = "ErrorCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(23f, 3f)
                horizontalLineToRelative(-1.38f)
                lineToRelative(1.5f, -3f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(5.06f)
                lineToRelative(-2.01f, 5.35f)
                curveToRelative(-0.15f, 0.39f, -0.52f, 0.65f, -0.94f, 0.65f)
                lineTo(2f, 16f)
                verticalLineToRelative(-4f)
                lineTo(0f, 12f)
                verticalLineToRelative(10f)
                lineTo(2f, 22f)
                verticalLineToRelative(-4f)
                lineTo(7.11f, 18f)
                curveToRelative(1.24f, 0f, 2.37f, -0.78f, 2.81f, -1.95f)
                lineToRelative(2.27f, -6.05f)
                horizontalLineToRelative(8.81f)
                close()
                moveTo(4f, 7f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14.88f)
                lineToRelative(-0.88f, 1.76f)
                verticalLineToRelative(4.24f)
                lineTo(5f, 8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(17f, 12f)
                lineToRelative(-7f, 12f)
                horizontalLineToRelative(14f)
                lineToRelative(-7f, -12f)
                close()
                moveTo(18f, 23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _ErrorCamera = it}
