package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentAutosave: ImageVector? = null

val Icons.Ts.DocumentAutosave: ImageVector
    get() = _DocumentAutosave ?: UXIcon(name = "DocumentAutosave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2.07f)
                curveToRelative(0.34f, 0.04f, 0.67f, 0.11f, 1f, 0.19f)
                verticalLineToRelative(-2.97f)
                lineToRelative(-7.29f, -7.29f)
                horizontalLineToRelative(-10.21f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(13f, 1.71f)
                lineTo(18.29f, 7f)
                horizontalLineToRelative(-5.29f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.98f)
                curveToRelative(-0.91f, -1.21f, -2.35f, -2f, -3.98f, -2f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(2.1f, 0f, 3.93f, 1.09f, 5f, 2.73f)
                verticalLineToRelative(-2.73f)
                close()
                moveTo(23f, 18f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                curveToRelative(-2.09f, 0f, -3.93f, -1.08f, -5f, -2.71f)
                verticalLineToRelative(2.71f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.97f)
                curveToRelative(0.91f, 1.21f, 2.34f, 2f, 3.97f, 2f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _DocumentAutosave = it}
