package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Butter: ImageVector? = null

val Icons.Ss.Butter: ImageVector
    get() = _Butter ?: UXIcon(name = "Butter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 15f)
                lineTo(1f, 15f)
                lineTo(1f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(10f)
                close()
                moveTo(20f, 2f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.63f, 0.84f, 1.0f, 1.88f, 1.0f, 3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                lineTo(23f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(0f, 17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                lineTo(0f, 17f)
                close()
            }
        }.also { _Butter = it}
