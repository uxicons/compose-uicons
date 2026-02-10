package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StoreAlt: ImageVector? = null

val Icons.Ss.StoreAlt: ImageVector
    get() = _StoreAlt ?: UXIcon(name = "StoreAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7f)
                lineTo(21.8f, 0f)
                horizontalLineToRelative(-4.8f)
                lineTo(17f, 5f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 5f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 0f)
                lineTo(2.2f, 0f)
                lineTo(0.02f, 6.78f)
                lineToRelative(-0.02f, 1.22f)
                curveToRelative(0f, 1.0f, 0.39f, 1.91f, 1f, 2.62f)
                verticalLineToRelative(10.38f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(12f, 24f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(15f, 11.44f)
                curveToRelative(0.37f, -0.22f, 0.72f, -0.47f, 1f, -0.8f)
                curveToRelative(0.73f, 0.83f, 1.81f, 1.36f, 3f, 1.36f)
                horizontalLineToRelative(1f)
                curveToRelative(0.35f, 0f, 0.68f, -0.06f, 1f, -0.14f)
                verticalLineToRelative(12.14f)
                horizontalLineToRelative(2f)
                lineTo(23f, 10.62f)
                curveToRelative(0.61f, -0.7f, 1f, -1.61f, 1f, -2.62f)
                verticalLineToRelative(-1f)
                close()
                moveTo(13f, 17f)
                lineTo(3f, 17f)
                verticalLineToRelative(-5.14f)
                curveToRelative(0.32f, 0.08f, 0.65f, 0.14f, 1f, 0.14f)
                horizontalLineToRelative(1f)
                curveToRelative(1.2f, 0f, 2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _StoreAlt = it}
