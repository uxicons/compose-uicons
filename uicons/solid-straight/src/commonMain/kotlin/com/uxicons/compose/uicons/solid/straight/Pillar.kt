package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pillar: ImageVector? = null

val Icons.Ss.Pillar: ImageVector
    get() = _Pillar ?: UXIcon(name = "Pillar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.02f)
                curveToRelative(-0.0f, 2.21f, -1.5f, 3.98f, -4.15f, 3.98f)
                curveToRelative(-2.15f, 0f, -3.85f, -1.57f, -3.85f, -3.5f)
                curveToRelative(0f, -0.54f, 0.13f, -1.04f, 0.35f, -1.5f)
                horizontalLineToRelative(-2.14f)
                curveToRelative(-0.14f, 0.48f, -0.21f, 0.98f, -0.21f, 1.5f)
                curveToRelative(0f, 1.33f, 0.47f, 2.55f, 1.26f, 3.5f)
                horizontalLineToRelative(-6.52f)
                curveToRelative(0.79f, -0.95f, 1.26f, -2.17f, 1.26f, -3.5f)
                curveToRelative(0f, -0.52f, -0.08f, -1.02f, -0.21f, -1.5f)
                horizontalLineToRelative(-2.14f)
                curveToRelative(0.22f, 0.46f, 0.35f, 0.96f, 0.35f, 1.5f)
                curveToRelative(0f, 1.93f, -1.69f, 3.5f, -3.85f, 3.5f)
                curveToRelative(-2.65f, 0f, -4.15f, -1.77f, -4.16f, -3.98f)
                curveToRelative(0f, -2.22f, 1.8f, -4.02f, 4.02f, -4.02f)
                horizontalLineToRelative(15.96f)
                curveToRelative(2.22f, 0f, 4.02f, 1.8f, 4.02f, 4.02f)
                close()
                moveTo(22f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                close()
                moveTo(9f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Pillar = it}
