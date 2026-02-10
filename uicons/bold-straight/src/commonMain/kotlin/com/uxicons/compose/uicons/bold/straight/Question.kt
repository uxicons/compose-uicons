package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Question: ImageVector? = null

val Icons.Bs.Question: ImageVector
    get() = _Question ?: UXIcon(name = "Question") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.79f)
                curveToRelative(0f, -2.37f, 1.39f, -4.44f, 3.91f, -5.83f)
                curveToRelative(1.91f, -1.05f, 2.89f, -3.13f, 2.51f, -5.3f)
                curveToRelative(-0.35f, -2.0f, -2.0f, -3.65f, -4f, -4f)
                curveToRelative(-1.51f, -0.27f, -2.98f, 0.12f, -4.13f, 1.09f)
                curveToRelative(-1.14f, 0.95f, -1.79f, 2.35f, -1.79f, 3.83f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -2.37f, 1.04f, -4.6f, 2.86f, -6.13f)
                curveTo(8.67f, 0.35f, 11.07f, -0.29f, 13.44f, 0.13f)
                curveToRelative(3.22f, 0.57f, 5.87f, 3.21f, 6.44f, 6.44f)
                curveToRelative(0.6f, 3.4f, -1.02f, 6.79f, -4.02f, 8.45f)
                curveToRelative(-1.56f, 0.86f, -2.36f, 1.94f, -2.36f, 3.2f)
                verticalLineToRelative(0.79f)
                close()
                moveTo(13.5f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Question = it}
