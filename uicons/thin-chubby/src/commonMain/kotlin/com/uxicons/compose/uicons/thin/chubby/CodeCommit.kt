package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeCommit: ImageVector? = null

val Icons.Tc.CodeCommit: ImageVector
    get() = _CodeCommit ?: UXIcon(name = "CodeCommit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.67f, 12.82f)
                curveToRelative(-0.09f, -0.03f, -2.1f, -0.75f, -5.06f, -1.27f)
                curveToRelative(-0.2f, -3.66f, -2.08f, -5.53f, -5.62f, -5.55f)
                curveToRelative(-3.52f, 0.02f, -5.41f, 1.89f, -5.61f, 5.55f)
                curveToRelative(-2.96f, 0.52f, -4.97f, 1.24f, -5.06f, 1.27f)
                curveToRelative(-0.26f, 0.09f, -0.41f, 0.39f, -0.3f, 0.64f)
                curveToRelative(0.18f, 0.43f, 0.58f, 0.32f, 0.64f, 0.3f)
                curveToRelative(0.02f, -0.01f, 1.95f, -0.7f, 4.73f, -1.2f)
                curveToRelative(0.24f, 3.49f, 2.21f, 5.41f, 5.61f, 5.43f)
                curveToRelative(3.44f, -0.02f, 5.37f, -1.9f, 5.6f, -5.43f)
                curveToRelative(2.78f, 0.5f, 4.71f, 1.19f, 4.73f, 1.2f)
                curveToRelative(0.06f, 0.02f, 0.47f, 0.14f, 0.64f, -0.3f)
                curveToRelative(0.1f, -0.24f, -0.04f, -0.55f, -0.3f, -0.64f)
                close()
                moveTo(12.0f, 17f)
                curveToRelative(-3.02f, -0.02f, -4.58f, -1.71f, -4.63f, -4.99f)
                curveToRelative(0.06f, -3.4f, 1.53f, -4.99f, 4.62f, -5.01f)
                curveToRelative(3.1f, 0.02f, 4.57f, 1.61f, 4.63f, 5f)
                curveToRelative(-0.06f, 3.34f, -1.57f, 4.98f, -4.62f, 5f)
                close()
            }
        }.also { _CodeCommit = it}
