package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Butter: ImageVector? = null

val Icons.Bs.Butter: ImageVector
    get() = _Butter ?: UXIcon(name = "Butter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 2f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                lineTo(0f, 16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.04f)
                curveToRelative(0.24f, 1.69f, 1.7f, 3f, 3.46f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(1.76f, 0f, 3.22f, -1.31f, 3.46f, -3f)
                horizontalLineToRelative(1.04f)
                verticalLineToRelative(-3f)
                close()
                moveTo(20f, 5.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 5.5f)
                curveToRelative(0f, -0.17f, -0.01f, -0.34f, -0.04f, -0.5f)
                horizontalLineToRelative(1.54f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
                moveTo(4f, 5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(10f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                lineTo(4f, 16f)
                lineTo(4f, 5.5f)
                close()
            }
        }.also { _Butter = it}
