package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeCommit: ImageVector? = null

val Icons.Rc.CodeCommit: ImageVector
    get() = _CodeCommit ?: UXIcon(name = "CodeCommit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.33f, 12.23f)
                curveToRelative(-0.08f, -0.03f, -1.85f, -0.64f, -4.5f, -1.11f)
                curveToRelative(-0.34f, -3.34f, -2.34f, -5.1f, -5.84f, -5.12f)
                curveToRelative(-3.48f, 0.02f, -5.48f, 1.78f, -5.82f, 5.12f)
                curveToRelative(-2.64f, 0.47f, -4.42f, 1.08f, -4.5f, 1.11f)
                curveToRelative(-0.52f, 0.18f, -0.83f, 0.78f, -0.59f, 1.29f)
                curveToRelative(0.42f, 0.88f, 1.13f, 0.64f, 1.24f, 0.6f)
                curveToRelative(0.02f, -0.01f, 1.56f, -0.54f, 3.88f, -0.97f)
                curveToRelative(0.44f, 3.08f, 2.5f, 4.83f, 5.8f, 4.85f)
                curveToRelative(3.34f, -0.02f, 5.36f, -1.73f, 5.79f, -4.85f)
                curveToRelative(2.31f, 0.43f, 3.86f, 0.97f, 3.88f, 0.97f)
                curveToRelative(0.11f, 0.04f, 0.9f, 0.23f, 1.25f, -0.61f)
                curveToRelative(0.21f, -0.51f, -0.07f, -1.1f, -0.59f, -1.28f)
                close()
                moveTo(12.01f, 16f)
                curveToRelative(-2.61f, -0.02f, -3.84f, -1.29f, -3.89f, -3.98f)
                curveToRelative(0.05f, -2.8f, 1.21f, -4.0f, 3.88f, -4.02f)
                curveToRelative(2.67f, 0.02f, 3.83f, 1.21f, 3.89f, 4f)
                curveToRelative(-0.05f, 2.75f, -1.25f, 3.98f, -3.88f, 4f)
                close()
            }
        }.also { _CodeCommit = it}
