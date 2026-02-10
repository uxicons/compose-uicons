package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceDrooling: ImageVector? = null

val Icons.Ss.FaceDrooling: ImageVector
    get() = _FaceDrooling ?: UXIcon(name = "FaceDrooling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.13f, 0.18f)
                curveTo(6.02f, -1.21f, -0.93f, 5.54f, 0.1f, 13.59f)
                curveToRelative(0.62f, 4.79f, 4.21f, 8.8f, 8.88f, 10.02f)
                curveToRelative(2.51f, 0.65f, 4.89f, 0.45f, 7.02f, -0.31f)
                verticalLineToRelative(-6.24f)
                curveToRelative(-0.56f, 0.26f, -1.24f, 0.5f, -2f, 0.68f)
                verticalLineToRelative(3.25f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(-3.11f, 0f, -5.56f, -2.16f, -5.67f, -2.25f)
                lineToRelative(1.33f, -1.49f)
                curveToRelative(0.02f, 0.02f, 2.0f, 1.75f, 4.34f, 1.75f)
                curveToRelative(2.38f, 0f, 4.39f, -1.44f, 4.41f, -1.45f)
                lineToRelative(1.59f, -1.15f)
                lineToRelative(0.0f, 8.98f)
                curveToRelative(4.14f, -2.4f, 6.73f, -7.19f, 5.82f, -12.5f)
                curveTo(22.98f, 4.98f, 19.03f, 1.03f, 14.13f, 0.18f)
                close()
                moveTo(6.84f, 11.54f)
                lineToRelative(-1.69f, -1.07f)
                curveToRelative(0.91f, -1.44f, 2.28f, -2.58f, 3.95f, -3.29f)
                lineToRelative(0.78f, 1.84f)
                curveToRelative(-1.28f, 0.55f, -2.36f, 1.44f, -3.05f, 2.52f)
                close()
                moveTo(17.16f, 11.54f)
                curveToRelative(-0.68f, -1.08f, -1.77f, -1.98f, -3.05f, -2.52f)
                lineToRelative(0.78f, -1.84f)
                curveToRelative(1.67f, 0.71f, 3.04f, 1.85f, 3.95f, 3.29f)
                lineToRelative(-1.69f, 1.07f)
                close()
            }
        }.also { _FaceDrooling = it}
