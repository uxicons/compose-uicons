package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeCommit: ImageVector? = null

val Icons.Sc.CodeCommit: ImageVector
    get() = _CodeCommit ?: UXIcon(name = "CodeCommit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.97f, 11.63f)
                curveToRelative(-0.07f, -0.02f, -1.62f, -0.53f, -3.94f, -0.95f)
                curveToRelative(-0.5f, -3.02f, -2.6f, -4.67f, -6.03f, -4.69f)
                curveToRelative(-3.41f, 0.02f, -5.5f, 1.66f, -6.01f, 4.69f)
                curveToRelative(-2.33f, 0.42f, -3.87f, 0.92f, -3.95f, 0.95f)
                curveToRelative(-0.79f, 0.26f, -1.23f, 1.11f, -0.96f, 1.89f)
                curveToRelative(0.45f, 1.31f, 1.74f, 1.01f, 1.89f, 0.96f)
                curveToRelative(0.01f, -0.01f, 1.24f, -0.4f, 3.1f, -0.76f)
                curveToRelative(0.65f, 2.69f, 2.77f, 4.26f, 5.94f, 4.28f)
                curveToRelative(3.21f, -0.02f, 5.3f, -1.55f, 5.93f, -4.28f)
                curveToRelative(1.86f, 0.36f, 3.08f, 0.76f, 3.09f, 0.76f)
                curveToRelative(0.15f, 0.05f, 1.43f, 0.34f, 1.89f, -0.96f)
                curveToRelative(0.28f, -0.78f, -0.17f, -1.63f, -0.96f, -1.89f)
                close()
            }
        }.also { _CodeCommit = it}
