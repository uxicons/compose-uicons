package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeSimple: ImageVector? = null

val Icons.Rr.CodeSimple: ImageVector
    get() = _CodeSimple ?: UXIcon(name = "CodeSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 22f)
                curveToRelative(-0.25f, 0f, -0.5f, -0.09f, -0.69f, -0.28f)
                lineTo(1.19f, 14.89f)
                curveToRelative(-1.57f, -1.57f, -1.57f, -4.11f, -0.01f, -5.67f)
                lineTo(8.3f, 2.28f)
                curveToRelative(0.4f, -0.39f, 1.03f, -0.38f, 1.41f, 0.02f)
                curveToRelative(0.39f, 0.4f, 0.38f, 1.03f, -0.02f, 1.41f)
                lineTo(2.58f, 10.65f)
                curveToRelative(-0.77f, 0.77f, -0.77f, 2.04f, 0.01f, 2.82f)
                lineToRelative(7.11f, 6.81f)
                curveToRelative(0.4f, 0.38f, 0.41f, 1.02f, 0.03f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.31f, -0.72f, 0.31f)
                close()
                moveTo(15.7f, 21.72f)
                lineToRelative(7.11f, -6.94f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.1f, -0.01f, -5.67f)
                lineTo(15.69f, 2.28f)
                curveToRelative(-0.4f, -0.38f, -1.03f, -0.37f, -1.41f, 0.03f)
                curveToRelative(-0.38f, 0.4f, -0.37f, 1.03f, 0.03f, 1.41f)
                lineToRelative(7.09f, 6.81f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.01f, 2.82f)
                lineToRelative(-7.1f, 6.93f)
                curveToRelative(-0.4f, 0.39f, -0.4f, 1.02f, -0.02f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.46f, 0.3f, 0.72f, 0.3f)
                curveToRelative(0.25f, 0f, 0.5f, -0.1f, 0.7f, -0.28f)
                close()
            }
        }.also { _CodeSimple = it}
