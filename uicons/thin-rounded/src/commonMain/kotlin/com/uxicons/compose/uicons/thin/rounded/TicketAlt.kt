package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TicketAlt: ImageVector? = null

val Icons.Tr.TicketAlt: ImageVector
    get() = _TicketAlt ?: UXIcon(name = "TicketAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 21f)
                lineToRelative(-15f, -0.0f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-1.42f)
                curveToRelative(0f, -0.14f, 0.06f, -0.27f, 0.15f, -0.36f)
                curveToRelative(0.1f, -0.09f, 0.23f, -0.14f, 0.36f, -0.14f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.42f, 0f, 2.56f, -1.14f, 2.56f, -2.54f)
                reflectiveCurveToRelative(-1.14f, -2.54f, -2.54f, -2.54f)
                curveToRelative(-0.28f, 0f, -0.54f, -0.22f, -0.54f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveTo(0f, 5.01f, 2.02f, 3.0f, 4.5f, 3.0f)
                lineToRelative(15f, 0.0f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(1f, 15.55f)
                verticalLineToRelative(0.95f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineToRelative(15f, 0.0f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.04f)
                curveToRelative(-1.69f, -0.24f, -3f, -1.7f, -3f, -3.46f)
                reflectiveCurveToRelative(1.31f, -3.22f, 3f, -3.46f)
                verticalLineToRelative(-1.04f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineToRelative(-15f, -0.0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.04f)
                curveToRelative(1.75f, 0.24f, 3.08f, 1.72f, 3.08f, 3.5f)
                curveToRelative(0f, 1.8f, -1.34f, 3.29f, -3.08f, 3.51f)
                close()
            }
        }.also { _TicketAlt = it}
